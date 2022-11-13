package modelo;


import java.util.Date;
import java.util.LinkedList;
import modelo.Objetos.Paciente;

public interface ModeloCrear {
    //Lo utiliza el CONTROLADOR, para la creacion de Objetos
    void crearPaciente(Paciente p);
}
