/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Base_de_datos;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author educe
 */
public class DAO_MEDICAMENTOS_SQLTest {
    
    public DAO_MEDICAMENTOS_SQLTest() {
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
    
   
    @Test
    public void testCrear() {
        System.out.println("crear");
        String nombre = "parecetamol";
        int cantidad = 10;
        String enfermedad_que_cura = "dolores";
        String efectos_secundarios = "hambre";
        String alergias = "ibuprofeno";
        DAO_MEDICAMENTOS_SQL instance = new DAO_MEDICAMENTOS_SQL();
        instance.crear(nombre, cantidad, enfermedad_que_cura, efectos_secundarios, alergias);
        // TODO review the generated test code and remove the default call to fail.
        String resultado= instance.leer(nombre);
        String esperado="parecetamol"+ " "+ cantidad;
        Assert.assertEquals(esperado, resultado);
        
    }

    /**
     * Test of obtenercantidad method, of class DAO_MEDICAMENTOS_SQL.
     */
    @Test
    public void testObtenercantidad() {
        System.out.println("obtenercantidad");
        String nombre = "Ibuprofeno";
        DAO_MEDICAMENTOS_SQL instance = new DAO_MEDICAMENTOS_SQL();
        String expResult = ""+ 10;
        String result = instance.obtenercantidad(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of enfermedades_que_cura method, of class DAO_MEDICAMENTOS_SQL.
     */
    @Test
    public void testEnfermedades_que_cura() {
        System.out.println("enfermedades_que_cura");
        String nombre = "Ibuprofeno";
        DAO_MEDICAMENTOS_SQL instance = new DAO_MEDICAMENTOS_SQL();
        String expResult = "Dolor de cabeza";
        String result = instance.enfermedades_que_cura(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of efectos_secundarios method, of class DAO_MEDICAMENTOS_SQL.
     */
    @Test
    public void testEfectos_secundarios() {
        System.out.println("efectos_secundarios");
        String nombre = "Ibuprofeno";
        DAO_MEDICAMENTOS_SQL instance = new DAO_MEDICAMENTOS_SQL();
        String expResult = "Fiebre";
        String result = instance.efectos_secundarios(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of alergias method, of class DAO_MEDICAMENTOS_SQL.
     */
    @Test
    public void testAlergias() {
        System.out.println("alergias");
        String nombre = "Medicamento";
        DAO_MEDICAMENTOS_SQL instance = new DAO_MEDICAMENTOS_SQL();
        String expResult = "aspirina";
        String result = instance.alergias(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    
}
