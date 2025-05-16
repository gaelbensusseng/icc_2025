public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(double lado) {
        // Llama al constructor padre para inicializar los atributos comunes
        super(lado, lado, 0, lado, lado);
    }

    // de nuevo, los metodos para nuestro cuadrado
    @Override
    public double area() {
        return getLado1() * getLado1();
    }

    @Override
    public double perimetro() {
        return 4 * getLado1();
    }

    @Override
    public String toString() {
        return String.format("Cuadrado (lado=%.2f)", getLado1());
    }
}
