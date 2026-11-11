import java.util.LinkedList;
import java.util.Queue;

public class ColaImpresion {
    public static void main(String[] args) {
        Queue<String> trabajos = new LinkedList<>();

        // Varios usuarios mandan documentos a imprimir
        trabajos.add("informe.pdf");
        trabajos.add("taller1.docx");
        trabajos.add("foto.png");

        int numero = 1;
        // La impresora procesa un documento a la vez, en orden de llegada
        while (!trabajos.isEmpty()) {
            String documento = trabajos.remove();
            System.out.println("Imprimiendo (" + numero + "): " + documento);
            numero++;

            // Mientras imprime, llega un nuevo trabajo: va al final de la cola
            if (documento.equals("informe.pdf")) {
                trabajos.add("tarea_urgente.pdf");
                System.out.println("  -> llegó un nuevo documento: tarea_urgente.pdf");
            }
        }
        System.out.println("No hay más documentos pendientes.");
    }
}
