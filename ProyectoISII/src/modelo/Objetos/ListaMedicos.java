/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

import java.util.Vector;

/**
 *
 * @author Alvaro
 */
public class ListaMedicos {
    private Vector<Medico> vectorMedicos = new Vector<Medico>();

    public ListaMedicos() {
    }
    
    public Vector<Medico> getVectorMedicos() {
        return vectorMedicos;
    }

    public void addMedico(Medico medico) {
        vectorMedicos.add(medico);
    }
    public boolean contains(Medico medico){
        int nombre=medico.getIdentificador();
        String contr=medico.getContraseña();
                Medico aux;

       for (int i=0; i<vectorMedicos.size();i++){
           aux= vectorMedicos.get(i);
                     
           if(nombre==aux.getIdentificador()){
               if(contr.equals(aux.getContraseña())){
                   return true;
               }
           }
           
       }
        return false;
    }
}
