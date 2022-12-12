/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

import java.util.ArrayList;
import java.util.Vector;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguelguillen
 */
public class ListaPacientesTest {
    
    public ListaPacientesTest() {
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
     * Test of getVectorMedicos method, of class ListaPacientes.
     */
    @Test
    public void testGetVectorMedicos() {
        System.out.println("getVectorMedicos");
        ListaPacientes instance = new ListaPacientes();
        Vector<Paciente> expResult = null;
        Vector<Paciente> result = instance.getVectorMedicos();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tamLista method, of class ListaPacientes.
     */
    @Test
    public void testTamLista() {
        System.out.println("tamLista");
        ListaPacientes instance = new ListaPacientes();
        int expResult = 0;
        int result = instance.tamLista();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addPaciente method, of class ListaPacientes.
     */
    @Test
    public void testAddPaciente() {
        System.out.println("addPaciente");
        Paciente enfermo = null;
        ListaPacientes instance = new ListaPacientes();
        instance.addPaciente(enfermo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class ListaPacientes.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        int i = 0;
        ListaPacientes instance = new ListaPacientes();
        Paciente expResult = null;
        Paciente result = instance.getPaciente(i);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ListaPacientes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Paciente enfermo = null;
        ListaPacientes instance = new ListaPacientes();
        boolean expResult = false;
        boolean result = instance.contains(enfermo);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PosicionEnfermo method, of class ListaPacientes.
     */
    @Test
    public void testPosicionEnfermo() {
        System.out.println("PosicionEnfermo");
        Paciente enfermo = null;
        ListaPacientes instance = new ListaPacientes();
        int expResult = 0;
        int result = instance.PosicionEnfermo(enfermo);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BorrarPaciente method, of class ListaPacientes.
     */
    @Test
    public void testBorrarPaciente() {
        System.out.println("BorrarPaciente");
        int i = 0;
        ListaPacientes instance = new ListaPacientes();
        instance.BorrarPaciente(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPacientes method, of class ListaPacientes.
     */
    @Test
    public void testConsultarPacientes() {
        System.out.println("consultarPacientes");
        ListaPacientes instance = new ListaPacientes();
        ArrayList<Object> expResult = null;
        ArrayList<Object> result = instance.consultarPacientes();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarDetallesEnfermo method, of class ListaPacientes.
     */
    @Test
    public void testConsultarDetallesEnfermo() {
        System.out.println("consultarDetallesEnfermo");
        Object enf = null;
        ListaPacientes instance = new ListaPacientes();
        Paciente expResult = null;
        Paciente result = instance.consultarDetallesEnfermo(enf);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarListaPacientes method, of class ListaPacientes.
     */
    @Test
    public void testListarListaPacientes() {
        System.out.println("listarListaPacientes");
        ListaPacientes instance = new ListaPacientes();
        String expResult = "";
        String result = instance.listarListaPacientes();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
