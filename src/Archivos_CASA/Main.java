package Archivos_CASA;

public class Main {

    public static void main(String[] args) {

        // Crear dos archivos de cada tipo
        Archivo a1 = new ArchivoTexto("documento1.txt", 10);
        Archivo a2 = new ArchivoTexto("documento2.txt", 20);

        Archivo a3 = new ArchivoImagen("imagen1.png", 5);
        Archivo a4 = new ArchivoImagen("imagen2.jpg", 8);

        Archivo a5 = new ArchivoVideo("video1.mp4", 50);
        Archivo a6 = new ArchivoVideo("video2.mp4", 100);

        // Desafío: crear archivos de audio
        Archivo a7 = new ArchivoAudio("audio1.mp3", 10);
        Archivo a8 = new ArchivoAudio("audio2.mp3", 20);

        // Crear repositorio
        RepositorioArchivos repositorio =
                new RepositorioArchivos();

        // Agregar archivos
        repositorio.agregarArchivo(a1);
        repositorio.agregarArchivo(a2);
        repositorio.agregarArchivo(a3);
        repositorio.agregarArchivo(a4);
        repositorio.agregarArchivo(a5);
        repositorio.agregarArchivo(a6);
        repositorio.agregarArchivo(a7);
        repositorio.agregarArchivo(a8);

        // Mostrar archivos
        System.out.println(repositorio.mostrarArchivos());

        // Mostrar cantidad
        System.out.println("===== CANTIDAD DE ARCHIVOS =====");
        System.out.println("Cantidad: "
                + repositorio.cantidadArchivos());

        // Calcular espacio procesado
        System.out.println("\n===== ESPACIO TOTAL PROCESADO =====");

        System.out.println("Total: "
                + repositorio.calcularEspacioTotalProcesado()
                + " MB");
    }
}
