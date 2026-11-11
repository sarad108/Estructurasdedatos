import java.util.Stack;
import java.util.Scanner;

public class BalanceParentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        // Pedir cadena
        System.out.print("Escribe una cadena con paréntesis: ");
        String cadena = sc.nextLine();

        boolean balanceado = true;

        // Recorrer cada carácter
        for (char c : cadena.toCharArray()) {
            if (c == '(') {
                pila.push(c); // Abrimos paréntesis
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    balanceado = false; // No hay con qué cerrar
                    break;
                } else {
                    pila.pop(); // Cerramos paréntesis
                }
            }
        }

        // Si quedan paréntesis sin cerrar
        if (!pila.isEmpty()) {
            balanceado = false;
        }

        // Resultado
        if (balanceado) {
            System.out.println("La cadena está balanceada ✅");
        } else {
            System.out.println("La cadena NO está balanceada ❌");
        }
    }
}
