package Archivos_CASA;

public class ArchivoImagen extends Archivo {

    private String resolucion;

    public ArchivoImagen(String nombre, double tamanoMB) {
        super(nombre, tamanoMB);
        this.resolucion = "1920x1080";
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.5;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                " | Tipo: Imagen" +
                " | Resolución: " + resolucion +
                " | Procesado: " +
                calcularEspacioProcesado() + " MB";
    }
}
