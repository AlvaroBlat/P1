/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Vector;

/**
 *
 * @author Alvaro
 */
public class ListaEnfermeras {
    private Vector<Enfermera> vectorEnfermeras = new Vector<Enfermera>();

    public ListaEnfermeras() {
    }

    public Vector<Enfermera> getVectorMedicos() {
        return vectorEnfermeras;
    }

    public void addEnfermera(Enfermera enfermera) {
        vectorEnfermeras.add(enfermera);
    }
    
    public boolean contains(Enfermera enfermera){
        int nombre=enfermera.getIdentificador();
        String contr=enfermera.getContraseña();
        Enfermera aux;

       for (int i=0; i<vectorEnfermeras.size();i++){
           aux= vectorEnfermeras.get(i);
                     
           if(nombre==aux.getIdentificador()){
               if(contr.equals(aux.getContraseña())){
                   return true;
               }
           }
           
       }
        return false;
    }
}
