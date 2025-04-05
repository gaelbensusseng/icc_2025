
public class Main {

    public static void main(String[] args) {
        System.out.println("--- P02: Listas Ligadas ---");

        // 1. Declaramos l lista
        ListaLigada miLista = new ListaLigada();

        // 2. Imprimir lista vacía
        System.out.println("1. Lista recién creada: " + miLista + " (Longitud: " + miLista.getLongitud() + ")");

        // 3. Insertamos 5 elementos
        System.out.println("\n2. Insertando 5 elementos...");
        miLista.insertar(10);
        miLista.insertar(20);
        miLista.insertar(30);
        miLista.insertar(40);
        miLista.insertar(50);

        // 4. Imprimimos la la lista con elementos
        System.out.println("3. Lista después de inserciones: " + miLista + " (Longitud: " + miLista.getLongitud() + ")");

        // 5. Elimina la cabeza
        System.out.println("\n4. Eliminando la cabeza (10)...");
        miLista.eliminar(10);

        // 6. Imprime la lista despues de eliminar la cabez
        System.out.println("5. Lista después de eliminar cabeza: " + miLista + " (Longitud: " + miLista.getLongitud() + ")");

        // 7. Eliminar un elemento intermedio (ni cabeza ni rabo)
        System.out.println("\n6. Eliminando un elemento intermedio (30)...");
        miLista.eliminar(30);

        // 8. Imprimir lista
        System.out.println("7. Lista después de eliminar intermedio: " + miLista + " (Longitud: " + miLista.getLongitud() + ")");

        // --- Pruebas Punto Extra ---
        System.out.println("\n--- Pruebas Punto Extra (insertarIndice) ---");
        // Lista actual: [20 -> 40 -> 50], Longitud: 3. Índices válidos: 0, 1, 2.

        // Insertar en índice válido != 0
        System.out.println("8. Insertando 35 en índice 1 (válido)...");
        miLista.insertarIndice(35, 1);

        // Imprimir lista
        System.out.println("9. Lista ahora: " + miLista + " (Longitud: " + miLista.getLongitud() + ")"); // Esperado: [20 -> 35 -> 40 -> 50]

        // Insertar en índice inválido
        System.out.println("\n10. Intentando insertar 99 en índice 5 (inválido)...");
        miLista.insertarIndice(99, 5); // L=4, válidos 0,1,2,3. 5 es inválido.
        System.out.println("11. Intentando insertar 100 en índice -1 (inválido)...");
        miLista.insertarIndice(100, -1); // -1 es inválido.
        System.out.println("12. Intentando insertar 101 en índice 4 (inválido, >= longitud)...");
        miLista.insertarIndice(101, 4); // Índice 4 es >= longitud (4), inválido según la práctica.

        // Imprimir lista (no debió cambiar)
        System.out.println("13. Lista después de intentos inválidos: " + miLista + " (Longitud: " + miLista.getLongitud() + ")");


    }
}
