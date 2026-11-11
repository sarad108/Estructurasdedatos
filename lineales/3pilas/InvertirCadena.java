import java.util.Stack;

public class InvertirCadena {
    public static void main(String[] args) {
        String palabra = "estructuras";
        Stack<Character> pila = new Stack<>();

        // 1. Metemos cada letra en la pila (la última queda arriba)
        for (char letra : palabra.toCharArray()) {
            pila.push(letra);
        }

        // 2. Sacamos las letras: salen en orden inverso (LIFO)
        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()) {
            invertida.append(pila.pop());
        }

        System.out.println("Original:  " + palabra);
        System.out.println("Invertida: " + invertida);
    }
}
