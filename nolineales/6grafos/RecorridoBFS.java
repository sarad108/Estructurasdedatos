import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecorridoBFS {

    // Distancia mínima (en saltos) desde "origen" hasta "destino"
    static int caminoMasCorto(List<List<Integer>> grafo, int origen, int destino) {
        int[] distancia = new int[grafo.size()];
        Arrays.fill(distancia, -1); // -1 = aún no visitado
        Queue<Integer> cola = new LinkedList<>();

        distancia[origen] = 0;
        cola.offer(origen);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            if (actual == destino) {
                return distancia[actual];
            }
            // Visitamos todos los vecinos antes de ir más lejos (por capas)
            for (int vecino : grafo.get(actual)) {
                if (distancia[vecino] == -1) {
                    distancia[vecino] = distancia[actual] + 1;
                    cola.offer(vecino);
                }
            }
        }
        return -1; // No hay camino
    }

    static void conectar(List<List<Integer>> grafo, int a, int b) {
        grafo.get(a).add(b);
        grafo.get(b).add(a);
    }

    public static void main(String[] args) {
        // 6 nodos numerados del 0 al 5
        List<List<Integer>> grafo = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            grafo.add(new ArrayList<>());
        }

        // 0 - 1 - 2 - 5
        // |       |
        // 3 ----- 4
        conectar(grafo, 0, 1);
        conectar(grafo, 1, 2);
        conectar(grafo, 2, 5);
        conectar(grafo, 0, 3);
        conectar(grafo, 3, 4);
        conectar(grafo, 4, 2);

        System.out.println("Saltos de 0 a 5: " + caminoMasCorto(grafo, 0, 5));
        System.out.println("Saltos de 3 a 1: " + caminoMasCorto(grafo, 3, 1));
    }
}
