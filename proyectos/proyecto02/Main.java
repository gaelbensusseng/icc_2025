import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Scanner para leer la entrada del usuario.
        Scanner entradaUsuario = new Scanner(System.in);
        Esteganografia estego = new Esteganografia(); // Instancia de la clase.
        int opcion = 0;

        System.out.println("---- Probador de Esteganografía ----");

        do {
            System.out.println("\nElige qué método quieres probar:");
            System.out.println("1. Descifrar Nulo (con n explícito)");
            System.out.println("2. Descifrar Nulo (n por espacios finales)");
            System.out.println("3. Buscar Nombre Oculto");
            System.out.println("4. Descifrar Palabras Marcadas");
            System.out.println("5. Descifrar Letras Marcadas");
            System.out.println("0. Salir");
            System.out.print("Tu opción: ");

            try {
                opcion = entradaUsuario.nextInt();
                entradaUsuario.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el texto original: ");
                        String originalNulo1 = entradaUsuario.nextLine();
                        System.out.print("Introduce el índice n (entero > 0): ");
                        int n1 = entradaUsuario.nextInt();
                        entradaUsuario.nextLine(); 
                        if (n1 > 0) {
                            String resultado1 = estego.descifraNulo(originalNulo1, n1);
                            System.out.println("Mensaje oculto: ->" + resultado1 + "<-");
                        } else {
                            System.out.println("El índice n debe ser mayor que 0.");
                        }
                        break;
                    case 2:
                        System.out.print("Introduce el texto original (con espacios al final si aplica): ");
                        String originalNulo2 = entradaUsuario.nextLine();
                        String resultado2 = estego.descifraNulo(originalNulo2);
                        System.out.println("Mensaje oculto: ->" + resultado2 + "<-");
                        break;
                    case 3:
                        System.out.print("Introduce el texto donde buscar: ");
                        String mensajeBuscar = entradaUsuario.nextLine();
                        System.out.print("Introduce el nombre a buscar: ");
                        String nombreBuscar = entradaUsuario.nextLine();
                        boolean encontrado = estego.contieneNombre(mensajeBuscar, nombreBuscar);
                        System.out.println("¿Nombre encontrado?: " + (encontrado ? "Sí" : "No"));
                        break;
                    case 4:
                        System.out.print("Introduce el texto M (original): ");
                        String textoM1 = entradaUsuario.nextLine();
                        System.out.print("Introduce el texto E (con palabras marcadas): ");
                        String textoE1 = entradaUsuario.nextLine();
                        String resultado4 = estego.descifraPalabrasMarcadas(textoM1, textoE1);
                        System.out.println("Mensaje oculto (palabras): ->" + resultado4 + "<-");
                        break;
                    case 5:
                        System.out.print("Introduce el texto M (original): ");
                        String textoM2 = entradaUsuario.nextLine();
                        System.out.print("Introduce el texto E (con letras marcadas): ");
                        String textoE2 = entradaUsuario.nextLine();
                        String resultado5 = estego.descifraLetrasMarcadas(textoM2, textoE2);
                        System.out.println("Mensaje oculto (letras): ->" + resultado5 + "<-");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        break;
                }
                // Captura error si se ingresa texto en lugar de número para la opción.
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Se esperaba un número.");
                entradaUsuario.nextLine(); // Limpia el buffer.
                opcion = -1; 
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "); 
            }

        } while (opcion != 0);

        // Cerrar el Scanner principal al finalizar.
        entradaUsuario.close();
    }
}