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
public class Conexion {
    Connection conexionBD;

    
    public Conexion(){
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
        Conexion cn=new Conexion();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from medicamentos where nombre=\""+medicamento+"\"" );
        while(rs.next()){
            cadena=cadena+(rs.getString("nombre")+ " "+ rs.getInt("cantidad"));}
        cn.conexionBD.close();
        }
         catch (Exception e){
}
        return cadena;
}
    
    
}
