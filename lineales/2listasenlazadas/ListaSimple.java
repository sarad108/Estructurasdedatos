public class ListaSimple {

    // Cada nodo guarda un dato y apunta al siguiente
    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static Nodo cabeza = null; // Primer nodo de la lista

    // Insertar al inicio: O(1)
    static void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza; // El nuevo apunta a la antigua cabeza
        cabeza = nuevo;           // Ahora el nuevo es la cabeza
    }

    // Insertar al final: O(n), hay que recorrer toda la lista
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

    static void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertarFinal(20);
        insertarFinal(30);
        insertarInicio(10);
        insertarFinal(40);
        imprimir(); // 10 -> 20 -> 30 -> 40 -> null
    }
}
