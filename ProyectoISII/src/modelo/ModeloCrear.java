package modelo;


import java.util.Date;
import java.util.LinkedList;
import modelo.Objetos.Paciente;

public interface ModeloCrear {
    //Lo utiliza el CONTROLADOR, para la creacion de Objetos
    void crearPaciente(Paciente p);
    
    // Funciones Enfermera
    String medicamentosPorDia(int año, int mes, int dia);
    Boolean[] logearse(int ident, String cont);
    String dameMedicamento(String nombre);
    String dameMedicamentos(Float cantidad);
}
