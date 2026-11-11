public class EliminarNodo {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    static Nodo cabeza = null;

    static void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // Elimina el primer nodo que tenga ese valor
    static boolean eliminar(int valor) {
        if (cabeza == null) {
            return false; // Lista vacía
        }

        // Caso especial: el nodo a borrar es la cabeza
        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return true;
        }

        // Buscar el nodo ANTERIOR al que queremos borrar
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            return false; // No se encontró el valor
        }

        // "Saltamos" el nodo: el anterior apunta al siguiente del borrado
        actual.siguiente = actual.siguiente.siguiente;
        return true;
    }

    static void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertarFinal(1);
        insertarFinal(2);
        insertarFinal(3);
        insertarFinal(4);
        System.out.print("Inicial:        ");
        imprimir();

        eliminar(3);
        System.out.print("Sin el 3:       ");
        imprimir();

        eliminar(1);
        System.out.print("Sin el 1 (cab): ");
        imprimir();

        System.out.println("¿Eliminar 99? " + eliminar(99));
    }
}
