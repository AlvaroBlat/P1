/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;
import java.util.ArrayList;
/**
 *
 * @author enric
 */
public class Medicamento {
    private ArrayList<String> efectos_secundarios= new ArrayList<String>();
    private ArrayList<String> alergias= new ArrayList<String>();
    private ArrayList<String> enfermedades_que_cura= new ArrayList<String>();


    private String nombre;
    private float cantidad;

    public Medicamento(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void AddEfectoSecundario(String efecto){
        efectos_secundarios.add(efecto);
    }
    public void AddAlergia(String efecto){
        alergias.add(efecto);
    }
 public void AddEnfermedades(String efecto){
        enfermedades_que_cura.add(efecto);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }
    public String listar_enfermedades(){
        String cadena=new String();
        for(int i=0; i<enfermedades_que_cura.size();i++){
            cadena=cadena+ enfermedades_que_cura.get(i)+ "\n";
        }
        return cadena;
    }
    public String listar_alergias(){
        String cadena=new String();
        for(int i=0; i<alergias.size();i++){
            cadena=cadena+ alergias.get(i)+ "\n";
        }
        return cadena;
    }
    public String listar_efectos(){
        String cadena=new String();
        for(int i=0; i<efectos_secundarios.size();i++){
            cadena=cadena+ efectos_secundarios.get(i)+ "\n";
        }
        return cadena;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Medicamento: " + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
}
