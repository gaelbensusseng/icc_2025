public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double base, double altura) {
        // Llama al constructor padre para iniciar sus atributos XD 
        super(base, altura, 0, base, altura);
    }

    // metodos para sacar las operaciones del rectangulo, llamamos a los getters. 
    @Override
    public double area() {
        return getBase() * getAltura();
    }

    @Override
    public double perimetro() {
        return 2 * (getBase() + getAltura());
    }

    @Override
    public String toString() {
        return String.format(
            "Rectángulo (base=%.2f; altura=%.2f)",
            getBase(), getAltura()
        );
    }
}