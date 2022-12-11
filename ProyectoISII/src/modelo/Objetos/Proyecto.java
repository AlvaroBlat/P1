/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author enric
 */
public class Proyecto {
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Enfermera> enfermeras;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    
    private ArrayList<TratamientoPacienteDia> listaTratameintoPacienteDia;
    private ArrayList<Usuario> usuarios;
    
    public Proyecto() {
        this.medicamentos = new ArrayList<Medicamento>();
        this.enfermeras = new ArrayList<Enfermera>();
        this.medicos = new ArrayList<Medico>();
        this.pacientes = new ArrayList<Paciente>();
        this.listaTratameintoPacienteDia = new ArrayList<TratamientoPacienteDia>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public ArrayList<Enfermera> getEnfermeras() {
        return enfermeras;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public ArrayList<Paciente> getPaceintes() {
        return pacientes;
    }
    
    public void cargarDatos(){
        // Usuario
        Usuario u1 = new Usuario(0, "cont0", true);
        Usuario u2 = new Usuario(1, "cont1", false);
        usuarios.add(u1);
        usuarios.add(u2);
        
        // Medicamentos
        Medicamento m = new Medicamento("Ibuprofeno", 1025); 
        Medicamento m1 = new Medicamento("Paracetamol (No quedan)", 0);
        Medicamento m2 = new Medicamento("Simvastatina", 550);
        Medicamento m3 = new Medicamento("Aspirina", 144);
        Medicamento m4 = new Medicamento("Omeprazol", 200);
        Medicamento m5 = new Medicamento("Lexotiroxina sódica", 500);
        Medicamento m6 = new Medicamento("Ramipril ", 796);
        Medicamento m7 = new Medicamento("Amlodipina ", 22);
        Medicamento m8 = new Medicamento("Atorvastatina  ", 0);
        Medicamento m9 = new Medicamento("Salbutamol  ", 44);
        Medicamento m10 = new Medicamento("Lansoprazol  ", 6969);

        medicamentos.add(m);
        medicamentos.add(m1);
        medicamentos.add(m2);
        medicamentos.add(m3);
        medicamentos.add(m4);
        medicamentos.add(m5);
        medicamentos.add(m6);
        medicamentos.add(m7);
        medicamentos.add(m8);
        medicamentos.add(m9);
        medicamentos.add(m10);
        
        // Enfermeras
        Enfermera e1 = new Enfermera(1,"cont1");
        enfermeras.add(e1);
        
        // Medicos
        Medico me1 = new Medico(0,"cont0");
        medicos.add(me1);
        
        // Pacientes
        Paciente p1 = new Paciente("12345678A","Miguel","Guillen","1","11/08/2023");
        Paciente p2 = new Paciente("12345678B","Alvaro","Blat","2","01/09/2023");
        Paciente p3 = new Paciente("12345238D","Pablo","Hernandez","3","11/08/2023");
        Paciente p4 = new Paciente("12323678G","Jorge","Ibañez","4","01/09/2023");
        Paciente p5 = new Paciente("12345768F","Lucas","Sanchez","5","11/08/2023");
        Paciente p6 = new Paciente("12345695C","Alejandro","Perez","6","01/09/2023");
        
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p5);
        pacientes.add(p6);
        
        // ListaTratameintoPacienteDia
        listaTratameintoPacienteDia.add(new TratamientoPacienteDia(p1, m1, "0.33 gr", 25, 10, 2022));
        listaTratameintoPacienteDia.add(new TratamientoPacienteDia(p2, m2, "0.6 gr", 25, 10, 2022));
        listaTratameintoPacienteDia.add(new TratamientoPacienteDia(p1, m2, "0.33 gr", 30, 10, 2022));
    }
    
    public String medicamentosPorDia(int año, int mes, int dia){
        String sol = "";
        
        for(TratamientoPacienteDia e : listaTratameintoPacienteDia){
            if(e.getAño()==año && e.getMes() == mes && e.getDia() == dia){
                sol += e.dameInfo() + "\n";
            }
        }
        return sol;
    }
    
    public Boolean[] usuario(int ident, String contraseña){
        Boolean[] sol = new Boolean[2];
        sol[0] = false; // Existe el usuario
        sol[1] = false; // Es medico
        
        for(Usuario u: usuarios){
            if(ident == u.getIdentificador() && u.getContraseña().equals(contraseña)){
                sol[0] = true;
                sol[1] = u.getEsMedico();
                return sol;
            }
        }
        return sol;
    }
  
    public String dameMedicamento(String nombre){
        String sol = "No existe medicamento con ese nombre";
        for(Medicamento e: medicamentos){
            
            if(e.getNombre().equals(nombre)){
                
                if(e.getCantidad() > 0){
                    return e.toString();
                }
                else{
                    return "error";
                }  
            }
        }
        
        return sol;
    }
    
    public String dameMedicamentos(Float cantidad){
        String sol = "Lista de medicamentos vacia";
        
        if(!medicamentos.isEmpty()){
            sol = "";
            float canMedi = 0;
            for(Medicamento e: medicamentos){
                canMedi = e.getCantidad();
                if(canMedi <= cantidad)
                    sol += e.getNombre() + ": " + canMedi +" gr\n";
            } 
        }

        return sol;
    }
    
    public void añadirPaciente(Paciente p){
        pacientes.add(p);
    }

    public void m(){
        System.out.println("Tamaño: " + medicamentos.size());
    }
}
