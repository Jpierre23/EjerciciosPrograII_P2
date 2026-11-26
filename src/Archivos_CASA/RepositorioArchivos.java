package Archivos_CASA;
import java.util.ArrayList;

public class RepositorioArchivos {

    private ArrayList<Archivo> archivos;

    public RepositorioArchivos() {
        archivos = new ArrayList<>();
    }

    // Agregar archivo
    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    // Mostrar todos los archivos
    public String mostrarArchivos() {
        String resultado = "===== REPOSITORIO DE ARCHIVOS =====\n";

        for (Archivo archivo : archivos) {
            resultado += archivo.mostrarInformacion() + "\n";
        }

        return resultado;
    }

    // Calcular espacio procesado total
    public double calcularEspacioTotalProcesado() {
        double total = 0;

        for (Archivo archivo : archivos) {
            total += archivo.calcularEspacioProcesado();
        }

        return total;
    }

    // Cantidad de archivos
    public int cantidadArchivos() {
        return archivos.size();
    }
}
