package Archivos_CASA;

public class ArchivoAudio extends Archivo {

    private String formato;

    public ArchivoAudio(String nombre, double tamanoMB) {
        super(nombre, tamanoMB);
        this.formato = "MP3";
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.7;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Audio" +
                " | Formato: " + formato +
                " | Procesado: " +
                calcularEspacioProcesado() + " MB";
    }
}
