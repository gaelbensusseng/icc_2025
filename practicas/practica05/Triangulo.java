public class Triangulo extends FiguraGeometrica {

    //constructor 
    public Triangulo(double lado1, double lado2, double lado3,double base, double altura) {
        // Llama al constructor padre 
        super(lado1, lado2, lado3, base, altura);
    }

    @Override
    public double area() { // metodo que retorna el area 
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public double perimetro() { // metodo que retorna el perimetro 
        return getLado1() + getLado2() + getLado3();
    }

    @Override

    // formato de salida al ejecutarse
    public String toString() {
        return String.format(
            "Triángulo (lados=%.2f, %.2f, %.2f; base=%.2f; altura=%.2f)",
            getLado1(), getLado2(), getLado3(), getBase(), getAltura()
        );
    }
}