import java.util.LinkedList;
import java.util.Queue;

public class PapaCaliente {
    public static void main(String[] args) {
        Queue<String> jugadores = new LinkedList<>();
        jugadores.offer("Ana");
        jugadores.offer("Beto");
        jugadores.offer("Carla");
        jugadores.offer("Diego");
        jugadores.offer("Elena");

        int pases = 3; // Cada ronda la papa se pasa 3 veces

        while (jugadores.size() > 1) {
            // Pasar la papa: el del frente se va al final de la cola
            for (int i = 0; i < pases; i++) {
                jugadores.offer(jugadores.poll());
            }
            // Quien queda en el frente se quema y sale del juego
            String eliminado = jugadores.poll();
            System.out.println("Eliminado: " + eliminado);
        }

        System.out.println("Ganador: " + jugadores.peek());
    }
}
