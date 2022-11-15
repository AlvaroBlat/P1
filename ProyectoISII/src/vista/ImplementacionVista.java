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

    public void setControlador(ImplementacionControlador controlador) {
        this.controlador = controlador;
    }


    public void ejecutar() {
        // Crear Ventana
        //JFrame ventana = new JFrame("Gestor de Tareas Swing");

        Login login = new Login(this);
        login.setVisible(true);
    }

    @Override
    public String dameInfoMedicinasPacientesPorFecha(int año, int mes, int dia) {
        return controlador.medicamentosPorDia(año, mes, dia);
    }

    @Override
    public Boolean[] compruebaUsuario(int ident, String cont) {      
        return controlador.logearse(ident, cont);
    }

    @Override
    public String ameMedicamento(String nombre) {
        return controlador.dameMedicamento(nombre);
    }

    @Override
    public String dameMedicamentos(Float cantidad) {
        return controlador.dameMedicamentos(cantidad);
    }
}

