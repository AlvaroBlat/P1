/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_de_datos;
import java.sql.*;

/**
 *
 * @author educe
 */
public class Conexion_medicamentos {
    Connection conexionBD;

    
    public Conexion_medicamentos(){
         //Conexion con la base de datos
        String bd = "jdbc:mysql://localhost/practicaIS2";
try {
 Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
 // Conexión usando usuario y clave de administrador de la BD
 conexionBD = DriverManager.getConnection(bd, "root", "******"); //PONER CADA UNO EL USARIO "root" Y LA CONTRASEÑA CON LA QUE CREASTEIS LA BD
} catch (Exception e) { // Error en la conexión con la BD
 System.out.println("Error de conexión");
 
}
        
    }
    
    public String getDatos(String medicamento) {
        Conexion_medicamentos cn=new Conexion_medicamentos();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+(rs.getString("nombre")+ " "+ rs.getInt("cantidad"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
}
    public String getcantidad(String medicamento) {
        Conexion_medicamentos cn=new Conexion_medicamentos();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+( rs.getInt("cantidad"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
}
     public String getEnfermedades_que_cura(String medicamento) {
        Conexion_medicamentos cn=new Conexion_medicamentos();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+( rs.getString("enfermedades_que_cura"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
}
     public String getEfectos_secundarios(String medicamento) {
        Conexion_medicamentos cn=new Conexion_medicamentos();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+( rs.getString("efectos_secundarios"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
}
     public String getAlergias(String medicamento) {
        Conexion_medicamentos cn=new Conexion_medicamentos();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+( rs.getString("alergias"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
}
    public void setDatos(String nombre, int cantidad, String enfermedad_que_cura,String efectos_secundarios, String alergias) {
       
        Conexion_medicamentos cn=new Conexion_medicamentos();
        try{
        Statement st;
        st=cn.conexionBD.createStatement();
        String con=("INSERT INTO medicamentos values('"+nombre+"'"+ ","+cantidad+","+"'"+ enfermedad_que_cura+"'"+ ","+"'"+efectos_secundarios+"',"+ "'"+alergias+"')" );
        PreparedStatement preparedStmt=conexionBD.prepareStatement(con);
        preparedStmt.executeUpdate();

        } catch (Exception e){
            System.out.println("ERROR");
        }
        
    }
    public void Eliminar(String nombre) {
       
        Conexion_medicamentos cn=new Conexion_medicamentos();
        try{
        Statement st;
        st=cn.conexionBD.createStatement();
        String con=("DELETE FROM medicamentos WHERE nombre='"+nombre+"'");
        PreparedStatement preparedStmt=conexionBD.prepareStatement(con);
        preparedStmt.executeUpdate();

        } catch (Exception e){
            System.out.println("ERROR");
        }
        
    }
    public void Actualizar(String nombre, int cantidad){
    Conexion_medicamentos cn=new Conexion_medicamentos();
        try{
        Statement st;
        st=cn.conexionBD.createStatement();
        String con=("UPDATE medicamentos SET cantidad="+ cantidad+ " where nombre='"+nombre+"'");
        PreparedStatement preparedStmt=conexionBD.prepareStatement(con);
        preparedStmt.executeUpdate();

        } catch (Exception e){
            System.out.println("ERROR");
        }}
    
  
    
    
}
