/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.List;
import controlador.Medicamento;
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
    
     public Medicamentos() {
        ArrayList<Medicamento> lista2 = new ArrayList();
        Medicamento m = new Medicamento("Ibuprofeno", 1025); 
        Medicamento m1 = new Medicamento("Paracetamol (No quedan)", 0);
        Medicamento m2 = new Medicamento("Simvastatina", 1025);
        Medicamento m3 = new Medicamento("Aspirina", 1025);
        Medicamento m4 = new Medicamento("Omeprazol", 1025);
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
