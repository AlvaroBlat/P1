package controlador;

import modelo.ModeloCrear;
import vista.VistaDarDato;
import modelo.Objetos.Paciente;

public class ImplementacionControlador implements Controlador{

    private VistaDarDato vistaDarDato;
    private ModeloCrear modeloCrear;

    public void setModeloCrear(ModeloCrear modeloCrear) {
        this.modeloCrear = modeloCrear;
    }

    public void setVistaDarModelo(VistaDarDato vistaDarDato) {
        this.vistaDarDato = vistaDarDato;
    }

    @Override
    public void crearPaciente(String ident, String nombre, String apellidos, String identificador, String fecha) {
        modeloCrear.crearPaciente(new Paciente(ident, nombre, apellidos, identificador, fecha));
    }

    @Override
    public String medicamentosPorDia(int año, int mes, int dia) {
        return modeloCrear.medicamentosPorDia(año, mes, dia);  
    }

    @Override
    public Boolean[] logearse(int ident, String cont) {
        return modeloCrear.logearse(ident, cont);
    }

    @Override
    public String dameMedicamento(String nombre) {
        return modeloCrear.dameMedicamento(nombre);
    }

    @Override
    public String dameMedicamentos(Float cantidad) {
        return modeloCrear.dameMedicamentos(cantidad);
    }
    

}

