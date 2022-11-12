/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Objetos;

/**
 *
 * @author enric
 */
public class Usuario {
    private Integer identificador;
    private String contraseña;
    private Boolean esMedico;

    public Usuario(Integer identificador, String contraseña, Boolean esMedico) {
        this.identificador = identificador;
        this.contraseña = contraseña;
        this.esMedico = esMedico;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEsMedico() {
        return esMedico;
    }

    public void setEsMedico(Boolean esMedico) {
        this.esMedico = esMedico;
    }

    
    
    
}
