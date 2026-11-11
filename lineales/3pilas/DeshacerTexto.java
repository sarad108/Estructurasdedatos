import java.util.Stack;

public class DeshacerTexto {
    public static void main(String[] args) {
        // Cada vez que "escribimos" guardamos el estado anterior en la pila
        Stack<String> historial = new Stack<>();
        String texto = "";

        // Escribir
        historial.push(texto);
        texto = texto + "Hola";
        System.out.println("Escribo:  " + texto);

        historial.push(texto);
        texto = texto + " mundo";
        System.out.println("Escribo:  " + texto);

        historial.push(texto);
        texto = texto + "!!!";
        System.out.println("Escribo:  " + texto);

        // Deshacer (Ctrl + Z): volvemos al último estado guardado
        while (!historial.isEmpty()) {
            texto = historial.pop();
            System.out.println("Deshacer: \"" + texto + "\"");
        }
    }
}
