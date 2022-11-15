/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Objetos;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author educe
 */
public class ListaPacientes {
    private Vector<Paciente> listaPacientes= new Vector<Paciente>();

    public ListaPacientes() {
        Paciente p1 = new Paciente("12345678A","Miguel","Guillen","1","11/08/2023");
        Paciente p2 = new Paciente("12345678B","Alvaro","Blat","2","01/09/2023");
        Paciente p3 = new Paciente("12345238D","Pablo","Hernandez","3","11/08/2023");
        Paciente p4 = new Paciente("12323678G","Jorge","Ibañez","4","01/09/2023");
        Paciente p5 = new Paciente("12345768F","Lucas","Sanchez","5","11/08/2023");
        Paciente p6 = new Paciente("12345695C","Alejandro","Perez","6","01/09/2023");
        
        listaPacientes.add(p1);
        listaPacientes.add(p2);
        listaPacientes.add(p3);
        listaPacientes.add(p4);
        listaPacientes.add(p5);
        listaPacientes.add(p6);
                
    }

     public Vector<Paciente> getVectorMedicos() {
        return listaPacientes;
    }
     
    public int tamLista(){
        return listaPacientes.size();
    }

    public void addPaciente(Paciente enfermo) {
        listaPacientes.add(enfermo);
    }
    
    public Paciente getPaciente(int i){
        return listaPacientes.get(i);
    }
    public boolean contains(Paciente enfermo){
        String nombre=enfermo.getIdentificador();
                Paciente aux;

       for (int i=0; i<listaPacientes.size();i++){
           aux= listaPacientes.get(i);
                     
           if(nombre.equals(aux.getIdentificador())){  
                   return true; 
           } 
       }
        return false;
    }
    public int PosicionEnfermo(Paciente enfermo){
        String nombre=enfermo.getIdentificador();
                Paciente aux;

       for (int i=0; i<listaPacientes.size();i++){
           aux= listaPacientes.get(i);
                     
           if(nombre.equals(aux.getIdentificador())){
               
                   return i;
               
           }
           
       }
        return -1;
    }
    public void BorrarPaciente(int i){
        listaPacientes.remove(i);
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
    
    public Paciente consultarDetallesEnfermo(Object enf) {
        Paciente detallesPaciente = detallesPaciente = ((Paciente) enf); //Nose si esta bien!!!
        //setPaciente(enf);
        return detallesPaciente;
    }
    
    public String listarListaPacientes(){
        String cadena="";
        
        Paciente aux;
        
        for (int i = 0; i < listaPacientes.size(); i++)
        {
            aux= listaPacientes.get(i);
            cadena = cadena + aux.getIdentificador() + "\n";
        }
        
        return cadena;
    }
    
    
}
