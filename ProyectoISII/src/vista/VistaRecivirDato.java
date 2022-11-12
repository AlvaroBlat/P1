package vista;

public interface VistaRecivirDato {
    String dameInfoMedicinasPacientesPorFecha(int año, int mes, int dia);
    Boolean[] compruebaUsuario(int ident, String cont);
    String ameMedicamento(String nombre);
    String dameMedicamentos();
}
