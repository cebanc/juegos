/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludoteca;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author papa
 */
public class LudotecaTest {
    
    Ludoteca l;
    Amigo a1, a2, a3;
    Juego j1, j2, j3, j4, j5;
    
    public LudotecaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a1 = new Amigo();
        a1.setNombre("Patxi");
        a1.setMaxJuegos(1);
        
        a2 = new Amigo();
        a2.setNombre("Edurne");
        a2.setMaxJuegos(2);
        
        a3 = new Amigo();
        a3.setNombre("Javi");
        a3.setMaxJuegos(3);
        
        j1=new Juego();
        j1.setAmigo(a1);
        j1.setAño(2011);
        j1.setTitulo("FIFA");
        
        j2=new Juego();
        j2.setAmigo(a2);
        j2.setAño(2012);
        j2.setTitulo("FIFA");    
        
        j3=new Juego();
        j3.setAmigo(a3);
        j3.setAño(2013);
        j3.setTitulo("FIFA");        
        
        j4=new Juego();
        j4.setAmigo(null);
        j4.setAño(2014);
        j4.setTitulo("FIFA"); 
        
        j5=new Juego();
        j5.setAmigo(null);
        j5.setAño(2015);
        j5.setTitulo("FIFA");      
        
        l = new Ludoteca("Play Station");

        l.añadirAmigo(a1);
        l.añadirAmigo(a2);
        
        l.añadirJuego(j1);
        l.añadirJuego(j2);
        l.añadirJuego(j3);
        l.añadirJuego(j4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Ludoteca.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "Play Station";
        String result = l.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmigos method, of class Ludoteca.
     */
    @Test
    public void testGetAmigos() {
        System.out.println("getAmigos");
        ArrayList<Amigo> aux = l.getAmigos();
        
        assertEquals(0, aux.indexOf(a1));
        assertEquals(1, aux.indexOf(a2));
    }

    /**
     * Test of getJuegos method, of class Ludoteca.
     */
    @Test
    public void testGetJuegos() {
        System.out.println("getJuegos");
        ArrayList<Juego> aux = l.getJuegos();
        
        assertEquals(0, aux.indexOf(j1));
        assertEquals(1, aux.indexOf(j2));
        assertEquals(2, aux.indexOf(j3));
        assertEquals(3, aux.indexOf(j4));
    }

    /**
     * Test of añadirAmigo method, of class Ludoteca.
     */
    @Test
    public void testAñadirAmigo() {
        System.out.println("añadirAmigo");
        Amigo a4=new Amigo();
        a4.setNombre("Pedro");
        a4.setMaxJuegos(20);
        l.añadirAmigo(a4);
        a4=new Amigo();
        a4.setNombre("Ana");
        a4.setMaxJuegos(2);
        l.añadirAmigo(a4);
        
        for (Amigo a : l.getAmigos())
            System.out.println(a.getNombre());
        assertEquals(4,l.getAmigos().size());
        assertEquals(3, l.getAmigos().indexOf(a4));
    }

    /**
     * Test of añadirJuego method, of class Ludoteca.
     */
    @Test
    public void testAñadirJuego() {
        System.out.println("añadirJuego");
        l.añadirJuego(j5);
        
        assertEquals(5,l.getJuegos().size());
        assertEquals(4, l.getJuegos().indexOf(j5)); 
    }


    /**
     * Test of prestarJuego method, of class Ludoteca.
     */
    @Test
    public void testPrestarJuego() {
        System.out.println("prestarJuego");
        assertFalse("No se puede prestar el juego",l.prestarJuego(a1, j1));
        assertFalse("a1 solo puede tomar un juego",l.prestarJuego(a1, j4));
        assertTrue("Se puede coger el juego",l.prestarJuego(a2, j4));
        assertFalse("a2 solo puede tomar dos juego",l.prestarJuego(a2, j5));
        assertTrue("Se puede coger el juego",l.prestarJuego(a3, j5));
    }

    /**
     * Test of devolverJuego method, of class Ludoteca.
     */
    @Test
    public void testDevolverJuego() {
        System.out.println("devolverJuego");
        assertFalse("No se puede devolver el juego",l.devolverJuego(j4));
        assertTrue("se puede devolver el juego",l.devolverJuego(j1));
    }

    /**
     * Test of getListaJuegosDisponibles method, of class Ludoteca.
     */
    @Test
    public void testGetListaJuegosDisponibles() {
        System.out.println("getListaJuegosDisponibles");
        ArrayList<Juego> aux = l.getListaJuegosDisponibles();
        assertEquals(1, aux.size());
        assertEquals(0, aux.indexOf(j4));
        l.añadirJuego(j5);
        l.devolverJuego(j1);
        aux = l.getListaJuegosDisponibles();
        assertEquals(3, aux.size());
        assertEquals(0, aux.indexOf(j1));
    }

    /**
     * Test of getListaJuegosPrestados method, of class Ludoteca.
     */
    @Test
    public void testGetListaJuegosPrestados() {
        System.out.println("getListaJuegosPrestados");
        ArrayList<Juego> aux = l.getListaJuegosPrestados();
        assertEquals(3, aux.size());
        assertEquals(0, aux.indexOf(j1));
        l.devolverJuego(j1);
        aux = l.getListaJuegosPrestados();
        assertEquals(2, aux.size());
        assertEquals(0, aux.indexOf(j2));
    }

    /**
     * Test of getListaJuegosAmigo method, of class Ludoteca.
     */
    @Test
    public void testGetListaJuegosAmigo() {
        System.out.println("getListaJuegosAmigo");
        ArrayList<Juego> aux = l.getListaJuegosAmigo(a1);
        assertEquals(1, aux.size());
        assertEquals(0, aux.indexOf(j1));
        l.devolverJuego(j1);
        aux = l.getListaJuegosAmigo(a1);
        assertEquals(0, aux.size());
    }

    /**
     * Test of toString method, of class Ludoteca.
     */
    @Test
    public void testToString() {

        String expResult = "Amigos: 2, juegos: 4";
        String result = l.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNombre method, of class Ludoteca.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        assertEquals("Play Station", l.getNombre());
        l.setNombre("Play Station 4");
        assertEquals("Play Station 4", l.getNombre());
    }

    /**
     * Test of borrarAmigo method, of class Ludoteca.
     */
    @Test
    public void testBorrarAmigo() {
        System.out.println("borrarAmigo");
        assertFalse("No se puede borrar el amigo 3",l.borrarAmigo(a3));
        l.devolverJuego(j3);
        assertTrue("Se puede borrar el amigo 3",l.borrarAmigo(a3));
    }

    /**
     * Test of borrarJuego method, of class Ludoteca.
     */
    @Test
    public void testBorrarJuego() {
        System.out.println("borrarJuego");
        assertTrue("Se puede borrar el juego 5",l.borrarJuego(j5));
        assertFalse("No e puede borrar el juego 1",l.borrarJuego(j1));
    }
    
}
