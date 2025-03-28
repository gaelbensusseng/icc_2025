import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear un reloj que comience en un momento específico
            Reloj miReloj = new Reloj(23, 59, 50);
            
            // Scanner para entrada del usuario
            Scanner scanner = new Scanner(System.in);
            
            // menú para elegir 
            System.out.println("Elige el tipo de iteración:");
            System.out.println("1. Ciclo FOR");
            System.out.println("2. Ciclo WHILE");
            System.out.println("3. Ciclo DO-WHILE");
            System.out.print("Ingresa tu opción: ");
            
            // el scanner 
            int opcion = scanner.nextInt();
            
            // Desplegando las opciones disponibles 
            switch(opcion) {
                case 1:
                    miReloj.simulacionConFor();
                    break;
                case 2:
                    miReloj.simulacionConWhile();
                    break;
                case 3:
                    miReloj.simulacionConDoWhile();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
            
            scanner.close();
        } catch (InterruptedException e) {
            System.out.println("Interrupción del reloj");
        }
    }
}

