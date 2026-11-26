package Archivos_CASA;

public class ArchivoVideo extends Archivo {

    private String calidad;

    public ArchivoVideo(String nombre, double tamanoMB) {
        super(nombre, tamanoMB);
        this.calidad = "Full HD";
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 2.0;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Video" +
                " | Calidad: " + calidad +
                " | Procesado: " +
                calcularEspacioProcesado() + " MB";
    }
}
