public class BusquedaBinaria {

    // Devuelve la posición del valor, o -1 si no existe
    // IMPORTANTE: el arreglo debe estar ORDENADO
    static int buscar(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == objetivo) {
                return medio;          // Lo encontramos
            } else if (arreglo[medio] < objetivo) {
                inicio = medio + 1;    // Descartamos la mitad izquierda
            } else {
                fin = medio - 1;       // Descartamos la mitad derecha
            }
        }
        return -1; // No está en el arreglo
    }

    public static void main(String[] args) {
        int[] ordenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        int[] pruebas = {23, 91, 7};
        for (int valor : pruebas) {
            int posicion = buscar(ordenado, valor);
            if (posicion >= 0) {
                System.out.println(valor + " está en la posición " + posicion);
            } else {
                System.out.println(valor + " NO está en el arreglo");
            }
        }
    }
}
