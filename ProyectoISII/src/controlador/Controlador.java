package controlador;

public interface Controlador {
    // Paceintes
    void crearPaciente(String ident, String nombre, String apellidos, String identificador, String fecha);
    
    // Funciones Enfermera
    String medicamentosPorDia(int año, int mes, int dia);
    Boolean[] logearse(int ident, String cont);
    String dameMedicamento(String nombre);
    String dameMedicamentos(Float cantidad);
}
  