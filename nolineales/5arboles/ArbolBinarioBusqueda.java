public class ArbolBinarioBusqueda {

    static class Nodo {
        int dato;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    static Nodo raiz = null;

    // Los menores van a la izquierda, los mayores a la derecha
    static Nodo insertar(Nodo nodo, int dato) {
        if (nodo == null) {
            return new Nodo(dato); // Encontramos el lugar vacío
        }
        if (dato < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, dato);
        } else if (dato > nodo.dato) {
            nodo.derecho = insertar(nodo.derecho, dato);
        }
        return nodo;
    }

    static boolean buscar(Nodo nodo, int dato) {
        if (nodo == null) {
            return false;
        }
        if (dato == nodo.dato) {
            return true;
        }
        // En cada paso descartamos la mitad del árbol
        if (dato < nodo.dato) {
            return buscar(nodo.izquierdo, dato);
        }
        return buscar(nodo.derecho, dato);
    }

    static int altura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    // Inorden: izquierda, raíz, derecha -> sale ordenado de menor a mayor
    static void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        int[] datos = {50, 30, 70, 20, 40, 60, 80};
        for (int d : datos) {
            raiz = insertar(raiz, d);
        }

        System.out.print("Inorden (ordenado): ");
        inorden(raiz);
        System.out.println();

        System.out.println("¿Está el 60? " + buscar(raiz, 60));
        System.out.println("¿Está el 65? " + buscar(raiz, 65));
        System.out.println("Altura del árbol: " + altura(raiz));
    }
}
