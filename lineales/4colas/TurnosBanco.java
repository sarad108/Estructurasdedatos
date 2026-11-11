import java.util.LinkedList;
import java.util.Queue;

public class TurnosBanco {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Llegan los clientes (entran por el final)
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("Marta");
        System.out.println("Clientes en espera: " + cola);
        System.out.println("Siguiente en ser atendido: " + cola.peek());

        // Atender: sale el que lleva más tiempo esperando (FIFO)
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendiendo a " + cliente + " | quedan " + cola.size());
        }
    }
}
