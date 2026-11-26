package Valvulas_CASA;

public class AnalizadorValvulas {

    private Valvula[] valvulas;

    // Constructor
    public AnalizadorValvulas(Valvula[] valvulas) {
        this.valvulas = valvulas;
    }

    // Contar válvulas activas
    public int contarActivas() {
        int contador = 0;

        for (Valvula valvula : valvulas) {
            if (valvula != null && valvula.isActiva()) {
                contador++;
            }
        }

        return contador;
    }

    // Calcular apertura promedio
    public double calcularAperturaPromedio() {
        double suma = 0;
        int contador = 0;

        for (Valvula valvula : valvulas) {
            if (valvula != null) {
                suma += valvula.getApertura();
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return suma / contador;
    }

    // Buscar válvula por código
    public Valvula buscarPorCodigo(String codigo) {
        for (Valvula valvula : valvulas) {
            if (valvula != null &&
                    valvula.getCodigo().equals(codigo)) {
                return valvula;
            }
        }

        return null;
    }

    // Obtener válvula con mayor presión
    public Valvula obtenerMayorPresion() {
        Valvula mayor = null;

        for (Valvula valvula : valvulas) {
            if (valvula != null) {
                if (mayor == null ||
                        valvula.getPresion() > mayor.getPresion()) {
                    mayor = valvula;
                }
            }
        }

        return mayor;
    }

    // DESAFÍO: Listar válvulas con apertura superior
    // al porcentaje recibido
    public String listarPorAperturaMayor(double porcentaje) {
        String resultado = "";

        for (Valvula valvula : valvulas) {
            if (valvula != null &&
                    valvula.getApertura() > porcentaje) {

                resultado += valvula.mostrarInformacion() + "\n";
            }
        }

        if (resultado.isEmpty()) {
            return "No hay válvulas con apertura superior a "
                    + porcentaje + "%";
        }

        return resultado;
    }
}
