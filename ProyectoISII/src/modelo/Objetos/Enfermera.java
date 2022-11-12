/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

/**
 *
 * @author Alvaro
 */
public class Enfermera {
    private int identificador;
    private String contraseña;

    public Enfermera(int identificador, String contraseña) {
        this.identificador = identificador;
        this.contraseña = contraseña;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Enfermera{" + "identificador=" + identificador + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
