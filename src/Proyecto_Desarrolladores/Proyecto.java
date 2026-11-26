package Proyecto_Desarrolladores;
import java.util.ArrayList;

public class Proyecto {

    // Atributos
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    // Constructor
    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {

        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {

        for (Desarrollador desarrollador : desarrolladores) {

            if (desarrollador.getIdentificacion().equals(identificacion)) {

                return desarrollador;
            }
        }

        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {

        Desarrollador encontrado = buscarDesarrollador(identificacion);

        if (encontrado != null) {

            desarrolladores.remove(encontrado);
            return true;
        }

        return false;
    }

    public double calcularTotalHoras() {

        double suma = 0;

        for (Desarrollador desarrollador : desarrolladores) {

            suma += desarrollador.getHorasAsignadas();
        }

        return suma;
    }

    public String mostrarEquipo() {

        String resultado = "";

        for (Desarrollador desarrollador : desarrolladores) {

            resultado += desarrollador.mostrarInformacion() + "\n";
        }

        if (resultado.equals("")) {
            return "El proyecto no tiene desarrolladores registrados.";
        }

        return resultado;
    }

    public Desarrollador obtenerMayorCarga() {

        Desarrollador mayor = null;

        for (Desarrollador desarrollador : desarrolladores) {

            if (mayor == null ||
                    desarrollador.getHorasAsignadas() > mayor.getHorasAsignadas()) {

                mayor = desarrollador;
            }
        }

        return mayor;
    }

}

