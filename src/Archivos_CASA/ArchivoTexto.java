package Archivos_CASA;

public class ArchivoTexto extends Archivo {

    private String formato;

    public ArchivoTexto(String nombre, double tamanoMB) {
        super(nombre, tamanoMB);
        this.formato = "TXT";
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.2;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Texto" +
                " | Formato: " + formato +
                " | Procesado: " +
                calcularEspacioProcesado() + " MB";
    }
}
