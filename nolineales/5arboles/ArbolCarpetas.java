import java.util.ArrayList;
import java.util.List;

public class ArbolCarpetas {

    // Árbol general: cada nodo puede tener cualquier cantidad de hijos
    static class Nodo {
        String nombre;
        List<Nodo> hijos = new ArrayList<>();

        Nodo(String nombre) {
            this.nombre = nombre;
        }

        Nodo agregar(String nombreHijo) {
            Nodo hijo = new Nodo(nombreHijo);
            hijos.add(hijo);
            return hijo;
        }
    }

    // Imprime el árbol con sangría según el nivel de profundidad
    static void imprimir(Nodo nodo, int nivel) {
        String sangria = "    ".repeat(nivel);
        System.out.println(sangria + "|- " + nodo.nombre);
        for (Nodo hijo : nodo.hijos) {
            imprimir(hijo, nivel + 1);
        }
    }

    // Cuenta todos los nodos del árbol
    static int contar(Nodo nodo) {
        int total = 1;
        for (Nodo hijo : nodo.hijos) {
            total += contar(hijo);
        }
        return total;
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo("Documentos");

        Nodo universidad = raiz.agregar("Universidad");
        universidad.agregar("Estructuras de datos");
        universidad.agregar("Bases de datos");

        Nodo fotos = raiz.agregar("Fotos");
        fotos.agregar("Vacaciones.jpg");
        fotos.agregar("Familia.jpg");

        raiz.agregar("CV.pdf");

        imprimir(raiz, 0);
        System.out.println("Total de elementos: " + contar(raiz));
    }
}
