/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author educe
 */
public class ListaEnfermos {
    private Vector<Enfermo> vectorEnfermos= new Vector<Enfermo>();

    public ListaEnfermos() {
    }

     public Vector<Enfermo> getVectorMedicos() {
        return vectorEnfermos;
    }

    public void addEnfermo(Enfermo enfermo) {
        vectorEnfermos.add(enfermo);
    }
    public boolean contains(Enfermo enfermo){
        String nombre=enfermo.getIdentificador();
                Enfermo aux;

       for (int i=0; i<vectorEnfermos.size();i++){
           aux= vectorEnfermos.get(i);
                     
           if(nombre.equals(aux.getIdentificador())){
               
                   return true;
               
           }
           
       }
        return false;
    }
    public int PosicionEnfermo(Enfermo enfermo){
        String nombre=enfermo.getIdentificador();
                Enfermo aux;

       for (int i=0; i<vectorEnfermos.size();i++){
           aux= vectorEnfermos.get(i);
                     
           if(nombre.equals(aux.getIdentificador())){
               
                   return i;
               
           }
           
       }
        return -1;
    }
    public void BorrarPaciente(int i){
        vectorEnfermos.remove(i);
    }
    
    /**
     * Metodo consultarPacientes
     *
     * @return
     */
    public ArrayList<Object> consultarPacientes() {
        ArrayList<Object> actividades = new ArrayList<>();
        return actividades;
    }
    
    public Enfermo consultarDetallesEnfermo(Object enf) {
        Enfermo detallesPaciente = detallesPaciente = ((Enfermo) enf); //Nose si esta bien!!!
        //setPaciente(enf);
        return detallesPaciente;
    }
    
    
}
