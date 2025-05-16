public abstract class FiguraGeometrica {
    //declaramos nuestras variables 
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;

    //generamos el metodo constructor
    protected FiguraGeometrica(double lado1, double lado2, double lado3,double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base  = base;
        this.altura= altura;
    }

    // como hicimos las variables de tipo private para mejorar el encapsulamiento, construimos los getters 
    protected double getLado1() { 
        return lado1; 
    }
    protected double getLado2() { 
        return lado2; 
    }
    protected double getLado3() {
        return lado3; 
    }
    protected double getBase()  {
        return base;  
    }
    protected double getAltura(){ 
        return altura;
    }


    public abstract double area();
    public abstract double perimetro();

    @Override
    //forzamos a cada figura a definir su propia representación
    public abstract String toString();
}