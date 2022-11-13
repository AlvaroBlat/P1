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
    public void crearPaciente(String ident, String nombre, String apellidos, String identificador) {
        modeloCrear.crearPaciente(new Paciente(ident, nombre, apellidos, identificador));
    }
    

}

