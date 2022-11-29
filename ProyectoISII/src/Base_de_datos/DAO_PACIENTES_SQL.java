/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;

/**
 *
 * @author educe
 */
public class DAO_PACIENTES_SQL implements DAO_PACIENTES {
        static Conexion_pacientes bd= new Conexion_pacientes();

    public DAO_PACIENTES_SQL() {
    }
        
        

    @Override
    public String getDatos(String nombre) {
       return bd.getDatos(nombre);
        
    }

    @Override
    public boolean borrar(String nombre) {
       return bd.Eliminar(nombre);
    }
    
    
    
}
