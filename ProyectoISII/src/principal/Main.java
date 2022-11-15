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

/**
 *
 * @author enric
 */


public class Main {
    public static void  main(String[] args){
        final ImplementacionVista vista = new ImplementacionVista();
        final ImplementacionControlador controlador = new ImplementacionControlador();
        final ImplementacionModelo modelo = new ImplementacionModelo();
        
        modelo.setVistaRecivirDato(vista);
        modelo.cargarDatos();
        //modelo.guardar();
        //modelo.m();
        
        controlador.setModeloCrear(modelo);
        controlador.setVistaDarModelo(vista);
        
        vista.setControlador(controlador);        
        vista.ejecutar();
    }
}
