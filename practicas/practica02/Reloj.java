import java.util.concurrent.TimeUnit;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundos;

    // Constructor
    public Reloj(int hora, int minuto, int segundos) {
        setHora(hora);
        setMinuto(minuto);
        setSegundos(segundos);
    }

    // Getters
    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    // Setters
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    // Incrementadores del tiempo
    public void incrementaSegundos() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            incrementaMinutos();
        }
    }

    public void incrementaMinutos() {
        minuto++;
        if (minuto >= 60) {
            minuto = 0;
            incrementaHora();
        }
    }

    public void incrementaHora() {
        hora++;
        if (hora >= 24) {
            hora = 0;
        }
    }

    public String obtenerFormato() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundos);
    }

    // Métodos de simulación
    public void simulacionConFor() throws InterruptedException {
        Reloj miReloj = new Reloj(hora, minuto, segundos);
        
        System.out.println("=== Simulación con Ciclo FOR ===");
        for (int i = 0; i < 20; i++) {
           
            
            // Mostrar tiempo
            System.out.println("Reloj en tiempo real (FOR):");
            System.out.println("====================");
            System.out.println(miReloj.obtenerFormato());
            
            // Incrementar segundos
            miReloj.incrementaSegundos();
            
            // Pausa de 1 segundo
            TimeUnit.SECONDS.sleep(1);
        }
    }
    
    public void simulacionConWhile() throws InterruptedException {
        Reloj miReloj = new Reloj(hora, minuto, segundos);
        
        System.out.println("=== Simulación con Ciclo WHILE ===");
        
        // Contador para limitar iteraciones
        int contador = 0;
        
        while (contador < 20) {
           
            
            // Mostrar tiempo
            System.out.println("Reloj en tiempo real (WHILE):");
            System.out.println("====================");
            System.out.println(miReloj.obtenerFormato());
            
            // Incrementar segundos
            miReloj.incrementaSegundos();
            
            // Incrementar contador
            contador++;
            
            // Pausa de 1 segundo
            TimeUnit.SECONDS.sleep(1);
        }
    }
    
    public void simulacionConDoWhile() throws InterruptedException {
        Reloj miReloj = new Reloj(hora, minuto, segundos);
        
        System.out.println("=== Simulación con Ciclo DO-WHILE ===");
        
        // Contador para limitar iteraciones
        int contador = 0;
        
        do {
            
            // Mostrar tiempo
            System.out.println("Reloj en tiempo real (DO-WHILE):");
            System.out.println("====================");
            System.out.println(miReloj.obtenerFormato());
            
            // Incrementar segundos
            miReloj.incrementaSegundos();
            
            // Incrementar contador
            contador++;
            
            // Pausa de 1 segundo
            TimeUnit.SECONDS.sleep(1);
        } while (contador < 20);
    }


}
