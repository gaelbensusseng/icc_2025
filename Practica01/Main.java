import java.util.Locale;
import java.util.Scanner; 

public class Main {
    // clase main 
    public static void main(String args[]){
        // dibujito de la calculadora XD
        System.out.println("+-----------------------------+");
        System.out.println("|         CALCULADORA         |");
        System.out.println("+-----------------------------+");
        System.out.println("| [ 1 ] [ = ]  [ Dividir ]    |");
        System.out.println("| [ 2 ] [ = ]  [  Multi  ]    |");
        System.out.println("| [ 3 ] [ = ]  [  Resta  ]    |");
        System.out.println("| [ 4 ] [ = ]  [   Suma  ]    |");
        System.out.println("+-----------------------------+");

        // declaración de variables
        double n1 = 0; 
        double n2 = 0; 
        int seleccion; 


        Scanner scanner = new Scanner(System.in); // lector de entrada de datos
        
        scanner.useLocale(Locale.US); // por lo que investigué, esto permite que se puedan ingresar numeros con . decimal 

        // bucle que revisa si la seleccion de operacion es valida
        // en caso de que no lo sea, vuelve a pedir un numero al usuario 
        do{
            System.out.println("Seleccione una opcion 1-4: ");
            seleccion = scanner.nextInt(); 
            
            if(seleccion > 4 || seleccion < 1){
                System.out.println("Error, digite de nuevo.");
            }
        } while(seleccion > 4 || seleccion < 1); 
        
        // seleccion de opciones dentro del rango de posibilidades 1-4
        if(seleccion == 1){
            System.out.println("Digite un primer numero: "); 
            n1 = scanner.nextDouble(); 
            System.out.println("Digite un segundo numero: "); 
            n2 = scanner.nextDouble(); 
            
            double div = n1 / n2; 
            System.out.println("La division de " + n1 + " y " + n2 + " es: " + div); 

        } else if(seleccion == 2){
            System.out.println("Digite un primer numero: "); 
            n1 = scanner.nextDouble(); 
            System.out.println("Digite un segundo numero: "); 
            n2 = scanner.nextDouble(); 

            double mult = n1 * n2; 
            System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es: " + mult); 

        } else if(seleccion == 3){
            System.out.println("Digite un primer numero: "); 
            n1 = scanner.nextDouble(); 
            System.out.println("Digite un segundo numero: "); 
            n2 = scanner.nextDouble(); 

            double resta = n1 - n2; 
            System.out.println("La resta de " + n1 + " y " + n2 + " es: " + resta);

        } else if(seleccion == 4){
            System.out.println("Digite un primer numero: "); 
            n1 = scanner.nextDouble(); 
            System.out.println("Digite un segundo numero: "); 
            n2 = scanner.nextDouble(); 

            double suma = n1 + n2; 
            System.out.println("La suma de " + n1 + " y " + n2 + " es: " + suma);
        }
    }
}
