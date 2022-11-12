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
public class TratamientoPacienteDia {
    private Paciente paciente;
    private Medicamento medicamento;
    private String cantidadMedicamente;
    private int dia;
    private int mes;
    private int año;

    public TratamientoPacienteDia(Paciente paciente, Medicamento medicamento, String cantidadMedicamente, int dia, int mes, int año) {
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.cantidadMedicamente = cantidadMedicamente;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getCantidadMedicamente() {
        return cantidadMedicamente;
    }

    public void setCantidadMedicamente(String cantidadMedicamente) {
        this.cantidadMedicamente = cantidadMedicamente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String dameInfo(){
        return paciente.toString() + "\n" + "Medicamento: " +  medicamento.getNombre() + " --> " + cantidadMedicamente + "\n";

    }
    
    
    
}
