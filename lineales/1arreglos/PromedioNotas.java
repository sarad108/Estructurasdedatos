public class PromedioNotas {
    public static void main(String[] args) {
        // Un arreglo tiene tamaño fijo: aquí son 5 notas
        double[] notas = {3.5, 4.0, 2.8, 4.5, 3.9};

        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        // Recorrer el arreglo por posición (índice 0 hasta length - 1)
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
    }
}
