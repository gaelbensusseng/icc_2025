public class Main {
    public static void main(String[] args) {
        FiguraGeometrica t1 = new Triangulo(3, 4, 5, 3, 4);
        FiguraGeometrica t2 = new Triangulo(5, 5, 5, 5, 4.33);
        FiguraGeometrica r  = new Rectangulo(5, 10);
        FiguraGeometrica c  = new Cuadrado(4);

        // Imprimimos las salidas

        //Triangulo 1: 
        System.out.println(t1);
        System.out.printf("Área=%.2f, Perímetro=%.2f%n", t1.area(), t1.perimetro());

        //Triangulo 2:
        System.out.println(t2);
        System.out.printf("Área=%.2f, Perímetro=%.2f%n", t2.area(), t2.perimetro());

        //Rectangulo 1: 
        System.out.println(r);
        System.out.printf("Área=%.2f, Perímetro=%.2f%n", r.area(), r.perimetro());

        //Cuadrado 1: 
        System.out.println(c);
        System.out.printf("Área=%.2f, Perímetro=%.2f%n", c.area(), c.perimetro());
    }
}