/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;

/**
 *
 * @author educe
 */
public class DAO {
    static Conexion bd= new Conexion();
    
    public void crear(){};
    public static void leer(String medicamento){
        System.out.println(        bd.getDatos(medicamento));}

    public void actualizar(){};
    public void borrar(){};  
    
    
    public static void main(String[] args) {
        String  medicamento="Ibuprofeno";
        leer(medicamento);
    }

    
    
}
