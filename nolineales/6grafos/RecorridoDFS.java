import java.util.ArrayList;
import java.util.List;

public class RecorridoDFS {

    // Va lo más profundo posible antes de devolverse (recursión = pila implícita)
    static void dfs(List<List<Integer>> grafo, int nodo, boolean[] visitado) {
        visitado[nodo] = true;
        System.out.print(nodo + " ");
        for (int vecino : grafo.get(nodo)) {
            if (!visitado[vecino]) {
                dfs(grafo, vecino, visitado);
            }
        }
    }

    static void conectar(List<List<Integer>> grafo, int a, int b) {
        grafo.get(a).add(b);
        grafo.get(b).add(a);
    }

    public static void main(String[] args) {
        // Dos "grupos" separados: {0,1,2,3} y {4,5} y el nodo solo {6}
        List<List<Integer>> grafo = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            grafo.add(new ArrayList<>());
        }
        conectar(grafo, 0, 1);
        conectar(grafo, 0, 2);
        conectar(grafo, 1, 3);
        conectar(grafo, 4, 5);

        boolean[] visitado = new boolean[grafo.size()];
        int grupos = 0;

        // Cada vez que arrancamos un DFS nuevo, descubrimos un grupo distinto
        for (int i = 0; i < grafo.size(); i++) {
            if (!visitado[i]) {
                grupos++;
                System.out.print("Grupo " + grupos + ": ");
                dfs(grafo, i, visitado);
                System.out.println();
            }
        }
        System.out.println("Total de grupos conectados: " + grupos);
    }
}
