import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoAmigos {

    // Lista de adyacencia: persona -> lista de sus amigos
    static Map<String, List<String>> amigos = new HashMap<>();

    static void agregarPersona(String nombre) {
        amigos.putIfAbsent(nombre, new ArrayList<>());
    }

    // Grafo NO dirigido: la amistad va en los dos sentidos
    static void hacerAmigos(String a, String b) {
        agregarPersona(a);
        agregarPersona(b);
        amigos.get(a).add(b);
        amigos.get(b).add(a);
    }

    // Amigos en común: los que están en ambas listas
    static List<String> enComun(String a, String b) {
        List<String> comunes = new ArrayList<>();
        for (String amigo : amigos.get(a)) {
            if (amigos.get(b).contains(amigo)) {
                comunes.add(amigo);
            }
        }
        return comunes;
    }

    public static void main(String[] args) {
        hacerAmigos("Ana", "Luis");
        hacerAmigos("Ana", "Marta");
        hacerAmigos("Luis", "Pedro");
        hacerAmigos("Marta", "Pedro");
        hacerAmigos("Pedro", "Sofía");

        System.out.println("Amigos de Pedro: " + amigos.get("Pedro"));
        System.out.println("Amigos de Ana: " + amigos.get("Ana"));
        System.out.println("Amigos en común entre Ana y Pedro: " + enComun("Ana", "Pedro"));
    }
}
