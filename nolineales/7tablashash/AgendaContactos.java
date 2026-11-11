import java.util.HashMap;
import java.util.Map;

public class AgendaContactos {
    public static void main(String[] args) {
        // Clave: nombre | Valor: teléfono
        Map<String, String> agenda = new HashMap<>();

        // Agregar
        agenda.put("Ana", "3001234567");
        agenda.put("Luis", "3109876543");
        agenda.put("Marta", "3205551234");

        // Buscar por clave: O(1) promedio
        System.out.println("Teléfono de Luis: " + agenda.get("Luis"));

        // Preguntar si existe
        System.out.println("¿Existe Pedro? " + agenda.containsKey("Pedro"));

        // Actualizar: repetir la clave reemplaza el valor
        agenda.put("Ana", "3000000000");
        System.out.println("Nuevo teléfono de Ana: " + agenda.get("Ana"));

        // Eliminar
        agenda.remove("Marta");
        System.out.println("Contactos guardados: " + agenda.size());
    }
}
