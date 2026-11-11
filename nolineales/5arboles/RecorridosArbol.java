import java.util.LinkedList;
import java.util.Queue;

public class RecorridosArbol {

    static class Nodo {
        String dato;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(String dato) {
            this.dato = dato;
        }
    }

    static void preorden(Nodo n) {
        if (n == null) return;
        System.out.print(n.dato + " ");  // 1. raíz
        preorden(n.izquierdo);           // 2. izquierda
        preorden(n.derecho);             // 3. derecha
    }

    static void inorden(Nodo n) {
        if (n == null) return;
        inorden(n.izquierdo);            // 1. izquierda
        System.out.print(n.dato + " ");  // 2. raíz
        inorden(n.derecho);              // 3. derecha
    }

    static void postorden(Nodo n) {
        if (n == null) return;
        postorden(n.izquierdo);          // 1. izquierda
        postorden(n.derecho);            // 2. derecha
        System.out.print(n.dato + " ");  // 3. raíz
    }

    // Por niveles: usa una COLA (une dos estructuras de este repo)
    static void porNiveles(Nodo raiz) {
        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");
            if (actual.izquierdo != null) cola.offer(actual.izquierdo);
            if (actual.derecho != null) cola.offer(actual.derecho);
        }
    }

    public static void main(String[] args) {
        //        A
        //       / \
        //      B   C
        //     / \   \
        //    D   E   F
        Nodo a = new Nodo("A");
        a.izquierdo = new Nodo("B");
        a.derecho = new Nodo("C");
        a.izquierdo.izquierdo = new Nodo("D");
        a.izquierdo.derecho = new Nodo("E");
        a.derecho.derecho = new Nodo("F");

        System.out.print("Preorden:   "); preorden(a);   System.out.println();
        System.out.print("Inorden:    "); inorden(a);    System.out.println();
        System.out.print("Postorden:  "); postorden(a);  System.out.println();
        System.out.print("Por niveles: "); porNiveles(a); System.out.println();
    }
}
