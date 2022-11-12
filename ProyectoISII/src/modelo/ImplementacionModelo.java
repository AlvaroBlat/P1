package modelo;



import java.util.Date;
import java.util.LinkedList;
import modelo.Objetos.Proyecto;
import vista.VistaRecivirDato;

public class ImplementacionModelo implements ModeloCrear {
    
    private VistaRecivirDato vistaRecivirDato;
    
    public void setVistaRecivirDato(VistaRecivirDato vistaRecivirDato) {
        this.vistaRecivirDato = vistaRecivirDato;
    }

    Proyecto proyecto = new Proyecto();

    public void cargarDatos(){
        proyecto.cargarDatos();
    }
    public String medicamentosPorDia(int año, int mes, int dia){
        return proyecto.medicamentosPorDia(año, mes, dia);
    }
    
    public Boolean[] logearse(int ident, String cont){
        return proyecto.usuario(ident, cont);
    }
    
    public String dameMedicamento(String nombre){
        return proyecto.dameMedicamento(nombre);
    }
    
        public String dameMedicamentos(){
        return proyecto.dameMedicamentos();
    }
}
