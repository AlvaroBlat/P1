/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;

/**
 *
 * @author educe
 */
public class DAO_MEDICAMENTOS_SQL implements DAO_MEDICAMENTOS {
    static Conexion_medicamentos bd= new Conexion_medicamentos();

    public DAO_MEDICAMENTOS_SQL() {
    }
    
    
    @Override
    public void crear(String nombre, int cantidad, String enfermedad_que_cura,String efectos_secundarios, String alergias){
        bd.setDatos(nombre, cantidad, enfermedad_que_cura, efectos_secundarios, alergias);
    };
    @Override
    public String obtenercantidad(String nombre){
        return bd.getcantidad(nombre);
    }
        @Override
    public String enfermedades_que_cura(String nombre){
        return bd.getEnfermedades_que_cura(nombre);
    }
        @Override
    public String efectos_secundarios(String nombre){
        return bd.getEfectos_secundarios(nombre);
    }
        @Override
    public String alergias(String nombre){
        return bd.getAlergias(nombre);
    }
        @Override
    public String leer(String medicamento){
        return bd.getDatos(medicamento);}

        @Override
    public void actualizar(String nombre, int cantidad){
        bd.Actualizar(nombre, cantidad);};
        @Override
    public void borrar(String nombre){
    bd.Eliminar(nombre);};  
    
    
 /*   public static void main(String[] args) {
        String  medicamento="Ibuprofeno";
        String nombre="Paracetamol";
        String efectos_secundarios="Cansancio";
        int cantidad=2;
        String enfermedad_que_cura="Dolor";
        String alergias="Ebastel";
        crear(nombre, cantidad, enfermedad_que_cura, efectos_secundarios, alergias);
        leer(medicamento);
        borrar(nombre);
        actualizar("Ibuprofeno", 10);
        
    } */

   

  

    

    
    
}
