/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludoteca;

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
    public class JuegoTest {
    private Amigo a1;
    Juego j1;
    public JuegoTest() {
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
        a1.setNombre("Carlos");
        a1.setMaxJuegos(3);
        
        j1 = new Juego();
        j1.setTitulo("FIFA");
        j1.setAño(2013);
        j1.setAmigo(a1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTitulo method, of class Juego.
     */
    @Test
    public void testSetTitulo() {
        j1.setTitulo("War of Crafts");
        assertEquals("War of Crafts",j1.getTitulo());
    }

    /**
     * Test of setAño method, of class Juego.
     */
    @Test
    public void testSetAño() {
        System.out.println("setAño");
        j1.setAño(2014);
        assertEquals(2014,j1.getAño());
    }

    /**
     * Test of getTitulo method, of class Juego.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        assertEquals("FIFA",j1.getTitulo());
    }

    /**
     * Test of getAño method, of class Juego.
     */
    @Test
    public void testGetAño() {
        System.out.println("getAño");
        assertEquals(2013,j1.getAño());
    }

    /**
     * Test of toString method, of class Juego.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "FIFA (2013)";
        String result = j1.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmigo method, of class Juego.
     */
    @Test
    public void testGetAmigo() {
        System.out.println("getAmigo");
        Amigo aux = j1.getAmigo();
        String expResult="Carlos (3)";
        assertEquals(expResult, aux.toString());
    }

    /**
     * Test of setAmigo method, of class Juego.
     */
    @Test
    public void testSetAmigo() {
        System.out.println("setAmigo");
        Amigo aux = new Amigo();
        aux.setMaxJuegos(5);
        aux.setNombre("Luis");
        
        j1.setAmigo(aux);
        
        String expResult="Luis (5)";
        String result = j1.getAmigo().toString();
        assertEquals(expResult, result);
    }
}
