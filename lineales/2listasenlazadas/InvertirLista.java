public class InvertirLista {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    static Nodo invertir(Nodo cabeza) {
        Nodo anterior = null;
        Nodo actual = cabeza;

        while (actual != null) {
            Nodo siguiente = actual.siguiente; // Guardamos el siguiente
            actual.siguiente = anterior;       // Damos vuelta a la flecha
            anterior = actual;                 // Avanzamos
            actual = siguiente;
        }
        return anterior; // El último nodo ahora es la nueva cabeza
    }

    static void imprimir(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Construimos 1 -> 2 -> 3 -> 4
        Nodo cabeza = new Nodo(1);
        cabeza.siguiente = new Nodo(2);
        cabeza.siguiente.siguiente = new Nodo(3);
        cabeza.siguiente.siguiente.siguiente = new Nodo(4);

        System.out.print("Original: ");
        imprimir(cabeza);

        cabeza = invertir(cabeza);

        System.out.print("Invertida: ");
        imprimir(cabeza);
    }
}
