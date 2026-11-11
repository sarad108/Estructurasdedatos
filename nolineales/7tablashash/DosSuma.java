import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DosSuma {

    // Devuelve las posiciones de dos números que sumen "objetivo"
    static int[] buscarPareja(int[] numeros, int objetivo) {
        // Clave: número ya visto | Valor: su posición
        Map<Integer, Integer> vistos = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            int faltante = objetivo - numeros[i];

            // ¿Ya vimos el número que complementa a este?
            if (vistos.containsKey(faltante)) {
                return new int[]{vistos.get(faltante), i};
            }
            vistos.put(numeros[i], i);
        }
        return null; // No hay pareja
    }

    public static void main(String[] args) {
        int[] numeros = {2, 7, 11, 15};
        int objetivo = 9;

        int[] resultado = buscarPareja(numeros, objetivo);
        if (resultado != null) {
            System.out.println("Posiciones: " + Arrays.toString(resultado));
            System.out.println(numeros[resultado[0]] + " + " + numeros[resultado[1]] + " = " + objetivo);
        } else {
            System.out.println("No hay pareja que sume " + objetivo);
        }
        // Con un solo recorrido: O(n). Con dos for anidados sería O(n²).
    }
}
