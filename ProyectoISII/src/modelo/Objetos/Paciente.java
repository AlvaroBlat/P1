/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Objetos;

/**
 *
 * @author educe
 */
public class Paciente {
    private String identificador;
    private String nombre;
    private String apellidos;
    private String habitacion;
    private String fecha_Cita;

    public Paciente(String identificador, String nombre, String apellidos, String habitacion, String fecha_Cita) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.habitacion = habitacion;
        this.fecha_Cita = fecha_Cita;
    }
    
    public Paciente(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getFecha_Cita() {
        return fecha_Cita;
    }

    public void setFecha_Cita(String fecha) {
        this.fecha_Cita = fecha;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", " + apellidos + "\nHabitacion: " + habitacion;
    }


    
    
    
}
