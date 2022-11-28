/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Base_de_datos;

/**
 *
 * @author educe
 */
public interface DAO_MEDICAMENTOS {
     public void crear(String nombre, int cantidad, String enfermedad_que_cura,String efectos_secundarios, String alergias);
     public String leer(String medicamento);
     public void actualizar(String nombre, int cantidad);
     public void borrar(String nombre);
     public String alergias(String nombre);
     public String efectos_secundarios(String nombre);
     public String enfermedades_que_cura(String nombre);
     public String obtenercantidad(String nombre);
    
}
