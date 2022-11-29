/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author enric
 */
public class ProyectoTest {
    Proyecto p;
    public ProyectoTest() {
        p = new Proyecto();
        p.cargar();
    }
    
    @BeforeEach
    private void preparacion() {
        p = new Proyecto();
        p.cargar();
    }
    

    /**
     * Test of getMedicamentos method, of class Proyecto.
     */
    @Test
    public void testGetMedicamentos() {
        System.out.println("medicamentosPorDia -- Todo bien");
        String sol = p.medicamentosPorDia(25, 10, 2022);
        System.out.println(sol);
        String s = p.medicamentosPorDia(25, 10, 2022);
        Assert.assertEquals("s", "s");        
    }


    
}
