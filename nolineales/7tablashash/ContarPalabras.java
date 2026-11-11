import java.util.HashMap;
import java.util.Map;

public class ContarPalabras {
    public static void main(String[] args) {
        String texto = "la pila y la cola son lineales y el arbol y el grafo no";
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : texto.split(" ")) {
            // getOrDefault: si la palabra no existe empieza en 0
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        // Recorrer cada par clave -> valor
        for (Map.Entry<String, Integer> par : frecuencia.entrySet()) {
            System.out.println(par.getKey() + " -> " + par.getValue());
        }
    }
}
