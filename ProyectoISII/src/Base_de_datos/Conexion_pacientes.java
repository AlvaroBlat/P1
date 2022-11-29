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
public class Conexion_pacientes {
    Connection conexionBD;
    
    public Conexion_pacientes(){
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
    public String getDatos(String dni) {
        Conexion_pacientes cn=new Conexion_pacientes();
        String cadena="";
        Statement st;
        ResultSet rs;
        try{
        st=cn.conexionBD.createStatement();
        rs=st.executeQuery("Select * from pacientes where dni=\""+dni+"\"" );
        while(rs.next()){
            cadena=cadena+(rs.getString("dni"));}
        cn.conexionBD.close();
        } catch (Exception e){
}
        return cadena;
        
}
    public boolean Eliminar(String nombre) {
       
        Conexion_pacientes cn=new Conexion_pacientes();
        try{
        Statement st;
        st=cn.conexionBD.createStatement();
        String con=("DELETE FROM pacientes WHERE dni='"+nombre+"'");
        PreparedStatement preparedStmt=conexionBD.prepareStatement(con);
        preparedStmt.executeUpdate();
        return true;

        } catch (Exception e){
            System.out.println("ERROR");
            return false;
        }
        
    }
    
}
