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
public class AmigoTest {
    
    public AmigoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Amigo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Amigo instance = new Amigo();
        String expResult = "Sin asignar";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxJuegos method, of class Amigo.
     */
    @Test
    public void testGetMaxJuegos() {
        System.out.println("getMaxJuegos");
        Amigo instance = new Amigo();
        int expResult = 1;
        int result = instance.getMaxJuegos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombre method, of class Amigo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Luis";
        Amigo instance = new Amigo();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of setMaxJuegos method, of class Amigo.
     */
    @Test
    public void testSetMaxJuegos() {
        System.out.println("setMaxJuegos");
        int maxJuegos = 3;
        Amigo instance = new Amigo();
        instance.setMaxJuegos(maxJuegos);
        assertEquals(maxJuegos, instance.getMaxJuegos());
    }
    
    @Test
    public void testToString(){
        System.out.println("toString");
        String salida = "Luis (3)";
        Amigo instance = new Amigo();
        instance.setMaxJuegos(3);
        instance.setNombre("Luis");
        assertEquals(salida, instance.toString());
    }
}
