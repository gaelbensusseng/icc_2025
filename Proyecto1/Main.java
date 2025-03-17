
public class Main {

    public static void main(String[] args) {
        System.out.println("Prueba Recipiente:\n");

        Recipiente a = new Recipiente(6, 12, 60);
        Recipiente b = new Recipiente(6, 12);
        Recipiente c = new Recipiente(4, 18, 20);
        Recipiente d = new Recipiente(5, 14.4, 0);

        System.out.println("A: " + a.muestra());
        System.out.println("B: " + b.muestra());
        System.out.println("C: " + c.muestra());
        System.out.println("D: " + d.muestra());
        System.out.println("-------------------");

        System.out.println("Capacidad A: " + a.capacidad());
        System.out.println("Restante C: " + c.capacidadRestante());
        System.out.println("B vacio? " + b.estaVacio());
        System.out.println("A lleno? " + a.estaLleno());
        System.out.println("-------------------");

        System.out.println("Rellenar D:");
        double exced = d.rellena(100);
        System.out.println("D: " + d.muestra() + " - Exced: " + exced);
        System.out.println("-------------------");

        System.out.println("Vaciar A:");
        double vac = a.vacia();
        System.out.println("A: " + a.muestra() + " - Vac: " + vac);
        System.out.println("--------------------");

        System.out.println("Verter (C->B):");
        b.rellena(50);
        c.rellena(30);
        System.out.println("B: " + b.muestra());
        System.out.println("C: " + c.muestra());
        c.vierte(b);
        System.out.println("B: " + b.muestra());
        System.out.println("C: " + c.muestra());
        System.out.println("----------------------");

        System.out.println("Comparar:");
        System.out.println("A y D misma cap? " + a.mismaCapacidad(d));
        System.out.println("A y B mismas dimensiones? " + a.mismasDimensiones(b));
        System.out.println("-----------------------");

        System.out.println("Contenedor justo de C:");
        Recipiente e = c.creaContenedorJusto();
        System.out.println("E: " + e.muestra() + " - misma cap? " + c.mismaCapacidad(e));
        System.out.println("------------------------");

        System.out.println("Rellenar B con cantidad negativa:");
        double excNeg = b.rellena(-30);
        System.out.println("B: " + b.muestra() + " - Exced: " + excNeg);
    }
}
