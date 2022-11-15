/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.ImplementacionControlador;
import javax.swing.SwingUtilities;
import modelo.ImplementacionModelo;
import vista.ImplementacionVista;
import java.sql.*;


/**
 *
 * @author enric
 */


public class Main {
    public static void  main(String[] args){
        
        //Conexion con la base de datos
        Connection conexionBD;
        String bd = "jdbc:mysql://localhost/practicaIS2";
try {
 Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
 // Conexión usando usuario y clave de administrador de la BD
 conexionBD = DriverManager.getConnection(bd, "root", "Diego2002"); //PONER CADA UNO EL USARIO "root" Y LA CONTRASEÑA CON LA QUE CREASTEIS LA BD
} catch (Exception e) { // Error en la conexión con la BD
 System.out.println("Error de conexión");
 
}


//REALIZAR CONSULTA SQL;
        
        
        final ImplementacionVista vista = new ImplementacionVista();
        final ImplementacionControlador controlador = new ImplementacionControlador();
        final ImplementacionModelo modelo = new ImplementacionModelo();
        
        modelo.setVistaRecivirDato(vista);
        modelo.cargarDatos();
        //modelo.guardar();
        //modelo.m();
        
        controlador.setModeloCrear(modelo);
        controlador.setVistaDarModelo(vista);
        
        vista.setModelo(modelo);
        vista.setControlador(controlador);        
        vista.ejecutar();
    }
}
