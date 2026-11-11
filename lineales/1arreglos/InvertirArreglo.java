import java.util.Arrays;

public class InvertirArreglo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        System.out.println("Original: " + Arrays.toString(numeros));

        // Dos índices: uno al inicio y otro al final
        int izquierda = 0;
        int derecha = numeros.length - 1;

        while (izquierda < derecha) {
            // Intercambiar (swap) usando una variable temporal
            int temporal = numeros[izquierda];
            numeros[izquierda] = numeros[derecha];
            numeros[derecha] = temporal;

            izquierda++; // Avanzamos desde la izquierda
            derecha--;   // Retrocedemos desde la derecha
        }

        System.out.println("Invertido: " + Arrays.toString(numeros));
    }
}
