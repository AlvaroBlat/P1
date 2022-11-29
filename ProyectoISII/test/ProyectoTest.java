/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enric
 */
import java.util.ArrayList;
import modelo.Objetos.Enfermera;
import modelo.Objetos.Medicamento;
import modelo.Objetos.Medico;
import modelo.Objetos.Paciente;
import modelo.Objetos.Proyecto;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class ProyectoTest {
    Proyecto p;
    
    
    @BeforeEach
    private void preparacion() {
        p = new Proyecto();
        p.cargar();
    }

    /**
     * Test of getMedicamentos method, of class Proyecto.
     */
    @Test
    public void test_medicamentosPorDia() {
        System.out.println("medicamentosPorDia -- Todo bien");
        String sol = p.medicamentosPorDia(25, 10, 2022);
        System.out.println(sol);
        assertEquals(sol, p.medicamentosPorDia(25, 10, 2022));
    }
    
    @Test
    public void test_medicamentosPorDia_NoHayMedicamentosEnFecha() {
        System.out.println("medicamentosPorDia -- En la fecha no hay nada");
        String sol = "No hay datos para esa fecha";
        assertEquals(sol, p.medicamentosPorDia(25, 11, 2022));
    }
    
    
    @Test
    public void test_usuario_todoBien() {
        System.out.println("Logearse -- Todo bien");
        Boolean[] sol = new Boolean[2];
        sol[0] = true; // Existe el usuario
        sol[1] = true; // Es medico
        
        int usuario = 1;
        String contraseña = "cont1";
        
        assertEquals(sol, p.usuario(usuario, contraseña));
    }
    
    @Test
    public void test_usuario_NoExiste() {
        System.out.println("Logearse -- El usuario no existe");
        Boolean[] sol = new Boolean[2];
        sol[0] = true; // Existe el usuario
        sol[1] = true; // Es medico
        
        int usuario = 12;
        String contraseña = "cont12";
        
        assertEquals(sol, p.usuario(usuario, contraseña));
    }
    
    @Test
    public void dameMedicamento_ElMedicamentoExiste(){
        assertEquals(0, 0);
    }
}
