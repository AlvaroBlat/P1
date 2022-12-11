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
        p.cargarDatos();
    }
    
    @BeforeEach
    private void preparacion() {
        p = new Proyecto();
        p.cargarDatos();
    }
    

    /**
     * Test of getMedicamentos method, of class Proyecto.
     */
    @Test
    public void test_GetMedicamentos() {
        //System.out.println("medicamentosPorDia -- Todo bien");
        String sol = p.medicamentosPorDia(2022, 10, 25);
        String solPreCargada = "Nombre: Miguel, Guillen\n" +
                        "Habitacion: 1\n" +
                        "Medicamento: Paracetamol (No quedan) --> 0.33 gr\n" +
                        "\n" +
                        "Nombre: Alvaro, Blat\n" +
                        "Habitacion: 2\n" +
                        "Medicamento: Simvastatina --> 0.6 gr\n\n";
        Assert.assertEquals(solPreCargada, sol);        
    }

    @Test
    public void test_medicamentosPorDia_NoHayMedicamentosEnFecha() {
        //System.out.println("medicamentosPorDia -- En la fecha no hay nada");
        String sol = p.medicamentosPorDia(2022, 11, 25);
        Assert.assertEquals("", sol);
    }
    
    
    @Test
    public void test_usuario_todoBien() {
        //System.out.println("Logearse -- Todo bien");
        Boolean[] sol = new Boolean[2];
        sol[0] = true; // Existe el usuario
        sol[1] = true; // Es medico
        
        int usuario = 0;
        String contraseña = "cont0";
        
        sol = p.usuario(usuario, contraseña);
        
        Assert.assertEquals(true, (sol[0] && sol[1]));
    }
    
    @Test
    public void test_usuario_NoExiste() {
        Boolean[] sol = new Boolean[2];
        sol[0] = true; // Existe el usuario
        sol[1] = true; // Es medico
        
        int usuario = 121;
        String contraseña = "pepe";
        
        sol = p.usuario(usuario, contraseña);
        
        Assert.assertEquals(false, (sol[0] && sol[1]));
    }

    @Test
        public void test_dameMedicamento() {
        String sol = p.dameMedicamento("Ibuprofeno");
        String solPreCargada = "Medicamento: Ibuprofeno, cantidad=1025.0}";
        Assert.assertEquals(solPreCargada, sol);        
    }

    @Test
        public void test_dameMedicamento_NoEsxite() {
        String sol = p.dameMedicamento("gfdfgbkfgdhbjkdfg");
        String solPreCargada = "No existe medicamento con ese nombre";
        Assert.assertEquals(solPreCargada, sol);        
    }    

    @Test
        public void test_dameMedicamento_NoHayExistencias() {
        String sol = p.dameMedicamento("Paracetamol (No quedan)");
        String solPreCargada = "error";
        Assert.assertEquals(solPreCargada, sol);        
    } 
        
    @Test
        public void test_dameMedicamentosCantidad() {
        float cantidada = 50;
        String sol = p.dameMedicamentos(cantidada);
        String solPreCargada = "Paracetamol (No quedan): 0.0 gr\n" +
                                "Amlodipina : 22.0 gr\n" +
                                "Atorvastatina  : 0.0 gr\n" +
                                "Salbutamol  : 44.0 gr\n";
      
        Assert.assertEquals(solPreCargada, sol);        
    }    
}
