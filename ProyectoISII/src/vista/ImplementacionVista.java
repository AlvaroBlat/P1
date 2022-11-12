package vista;

import controlador.ImplementacionControlador;
import modelo.ImplementacionModelo;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.LinkedList;
import vista.principal.Login;

public class ImplementacionVista extends WindowAdapter implements VistaDarDato, VistaRecivirDato{

    private ImplementacionControlador controlador;
    private ImplementacionModelo modelo;

    public void setControlador(ImplementacionControlador controlador) {
        this.controlador = controlador;
    }
    public void setModelo(ImplementacionModelo modelo) {this.modelo = modelo;}


    public void ejecutar() {
        // Crear Ventana
        //JFrame ventana = new JFrame("Gestor de Tareas Swing");

        Login login = new Login(this);
        login.setVisible(true);
    }

    @Override
    public String dameInfoMedicinasPacientesPorFecha(int año, int mes, int dia) {
        return modelo.medicamentosPorDia(año, mes, dia);
    }

    @Override
    public Boolean[] compruebaUsuario(int ident, String cont) {      
        return modelo.logearse(ident, cont);
    }

    @Override
    public String ameMedicamento(String nombre) {
        return modelo.dameMedicamento(nombre);
    }

    @Override
    public String dameMedicamentos() {
        return modelo.dameMedicamentos();
    }
}

