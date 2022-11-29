/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

import java.awt.List;
import modelo.Objetos.Medicamento;
import java.util.ArrayList;
/**
 *
 * @author enric
 */
public class Medicamentos {
    ArrayList<Medicamento> lista;

    public Medicamentos(ArrayList lista) {
        this.lista = lista;
    }
    public int size(){
        return lista.size();
    }
    
    
   
    
     public Medicamentos() {
        ArrayList<Medicamento> lista2 = new ArrayList();
        Medicamento m = new Medicamento("Ibuprofeno", 1025); 
        m.AddEfectoSecundario("diarrea");
        m.AddEfectoSecundario("mareos");
        m.AddEfectoSecundario("fiebre");
        m.AddEfectoSecundario("urticaria");
        m.AddEfectoSecundario("dificultad para respirar");
        m.AddEfectoSecundario("nauseas");
        m.AddEfectoSecundario("aumento de peso sin explicación");
        
        m.AddAlergia("metamizol");
        m.AddAlergia("aspirina");
        
        m.AddEnfermedades("Dolor de cabeza");
        m.AddEnfermedades("inflamación");
        m.AddEnfermedades("malestar general");
        


        
        Medicamento m1 = new Medicamento("Paracetamol (No quedan)", 0);
        m1.AddEfectoSecundario("diarrea");
        m1.AddEfectoSecundario("mareos");
        m1.AddEfectoSecundario("fiebre");
        m1.AddEfectoSecundario("urticaria");
        m1.AddEfectoSecundario("dificultad para respirar");
        m1.AddEfectoSecundario("nauseas");
        m1.AddEfectoSecundario("aumento de peso sin explicación");
        
        m1.AddAlergia("metamizol");
        m1.AddAlergia("aspirina");
        
        m1.AddEnfermedades("Dolor de cabeza");
        m1.AddEnfermedades("inflamación");
        m1.AddEnfermedades("malestar general");
        Medicamento m2 = new Medicamento("Simvastatina", 1025);
        m2.AddEfectoSecundario("diarrea");
        m2.AddEfectoSecundario("mareos");
        m2.AddEfectoSecundario("fiebre");
        m2.AddEfectoSecundario("urticaria");
        m2.AddEfectoSecundario("dificultad para respirar");
        m2.AddEfectoSecundario("nauseas");
        m2.AddEfectoSecundario("aumento de peso sin explicación");
        
        m2.AddAlergia("metamizol");
        m2.AddAlergia("aspirina");
        
        m2.AddEnfermedades("Dolor de cabeza");
        m2.AddEnfermedades("inflamación");
        m2.AddEnfermedades("malestar general");
        Medicamento m3 = new Medicamento("Aspirina", 1025);
        m3.AddEfectoSecundario("diarrea");
        m3.AddEfectoSecundario("mareos");
        m3.AddEfectoSecundario("fiebre");
        m3.AddEfectoSecundario("urticaria");
        m3.AddEfectoSecundario("dificultad para respirar");
        m3.AddEfectoSecundario("nauseas");
        m3.AddEfectoSecundario("aumento de peso sin explicación");
        
        m3.AddAlergia("metamizol");
        m3.AddAlergia("aspirina");
        
        m3.AddEnfermedades("Dolor de cabeza");
        m3.AddEnfermedades("inflamación");
        m3.AddEnfermedades("malestar general");
        Medicamento m4 = new Medicamento("Omeprazol", 1025);
        m4.AddEfectoSecundario("mareos");
        m4.AddEfectoSecundario("urticaria");
        m4.AddEfectoSecundario("dificultad para respirar");
        m4.AddEfectoSecundario("nauseas");
        m4.AddEfectoSecundario("aumento de peso sin explicación");
        
        m4.AddAlergia("metamizol");
        m4.AddAlergia("aspirina");
        
        m4.AddEnfermedades("inflamación");
        m4.AddEnfermedades("malestar general");
        Medicamento m5 = new Medicamento("Lexotiroxina sódica", 1025);
        
        Medicamento m6 = new Medicamento("Ramipril ", 1025);
        Medicamento m7 = new Medicamento("Amlodipina ", 1025);
        Medicamento m8 = new Medicamento("Atorvastatina  ", 1025);
        Medicamento m9 = new Medicamento("Salbutamol  ", 1025);
        Medicamento m10 = new Medicamento("Lansoprazol  ", 1025);

        lista2.add(m);
        lista2.add(m1);
        lista2.add(m2);
        lista2.add(m3);
        lista2.add(m4);
        lista2.add(m5);
        lista2.add(m6);
        lista2.add(m7);
        lista2.add(m8);
        lista2.add(m9);
        lista2.add(m10);
        
        this.lista = lista2;
    }

    public ArrayList getLista() {
        return lista;
    }
    public boolean buscar(String nombre){
        Medicamento aux;
        for(int i=0; i<lista.size();i++){
            aux= lista.get(i);
            if(nombre.equals(aux.getNombre())){
                return true;
            }
            
        } 
                return false;
                
    }
    public Medicamento getMedicamento(String nombre){
        Medicamento aux;
        for(int i=0; i<lista.size();i++){
            aux= lista.get(i);
            if(nombre.equals(aux.getNombre())){
                return aux;
            }
            
        } 
                return null;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
     
     public String dameLista(){
         String sol = "";
         for(int i =0; i< lista.size(); i++){
             sol += "- " + lista.get(i).getNombre() + "\n";
         }
         
         if(sol.equals("")){
             return "No hay medicamentos";
         }
         
         return sol;
     }
}
