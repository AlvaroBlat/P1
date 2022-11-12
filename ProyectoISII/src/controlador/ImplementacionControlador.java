package controlador;

import modelo.ModeloCrear;
import vista.VistaDarDato;

public class ImplementacionControlador implements Controlador{

    private VistaDarDato vistaDarDato;
    private ModeloCrear modeloCrear;

    public void setModeloCrear(ModeloCrear modeloCrear) {
        this.modeloCrear = modeloCrear;
    }

    public void setVistaDarModelo(VistaDarDato vistaDarDato) {
        this.vistaDarDato = vistaDarDato;
    }
    

}

