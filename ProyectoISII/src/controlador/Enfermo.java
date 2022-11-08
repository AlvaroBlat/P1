/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author educe
 */
public class Enfermo {
    private String identificador;
    private String nombre;
    private String apellidos;
    private String habitacion;

    public Enfermo(String identificador, String nombre, String apellidos, String habitacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.habitacion = habitacion;
    }
    
    public Enfermo(String identificador) {
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


    
    
    
}
