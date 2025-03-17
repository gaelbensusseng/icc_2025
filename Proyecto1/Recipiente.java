
public class Recipiente implements ServiciosRecipiente {
    // Aquí van las propiedades de nuestro recipiente
    private double radio;
    private double altura;
    private double cantidadActual;
    private static final double PI = 3.1415; // Usamos una aproximación de PI para los cálculos

    /**
     * Constructor completo que crea un recipiente con todo y su contenido.
     * Si la cantidad es demasiada o negativa, la ajustamos automáticamente.
     */
    public Recipiente(double radio, double altura, double cantidadActual) {
        this.radio = radio;
        this.altura = altura;

        // Checamos que la cantidad esté dentro de los límites
        if (cantidadActual < 0) {
            // No podemos tener cantidades negativas, así que la ponemos en cero
            this.cantidadActual = 0;
        } else if (cantidadActual > capacidad()) {
            // Si nos quieren meter más de lo que cabe, llenamos hasta el tope
            this.cantidadActual = capacidad();
        } else {
            // Todo normal, asignamos lo que nos pidieron
            this.cantidadActual = cantidadActual;
        }
    }


    public Recipiente(double radio, double altura) {
        this(radio, altura, 0); // Llamamos al otro constructor con cantidad cero
    }


      //Calcula cuánto líquido puede almacenar el recipiente en total.

    @Override
    public double capacidad() {
        return PI * radio * radio * altura; // fórmula del volumen del cilindro
    }


   //metodo que nos dice cuánto espacio queda disponible en el recipiente.

    @Override
    public double capacidadRestante() {
        return capacidad() - cantidadActual; // Simple resta
    }


      //Nos dice si el recipiente está vacío.

    @Override
    public boolean estaVacio() {
        return cantidadActual == 0; // Si no tiene nada, está vacío
    }


      //Nos dice si el recipiente está hasta el tope.

    @Override
    public boolean estaLleno() {
        return cantidadActual == capacidad(); // Si está a capacidad máxima, está lleno
    }

    @Override
    public double rellena(double cantidad) {
        if (cantidad <= 0) return 0; // No hacemos nada con valores negativos o cero

        double nuevaCantidad = cantidadActual + cantidad;
        double excedente = 0;

        if (nuevaCantidad > capacidad()) {
            // Calculamos cuánto se derrama
            excedente = nuevaCantidad - capacidad();
            cantidadActual = capacidad(); // Llenamos hasta el tope
        } else {
            // Todo cabe, no hay problema
            cantidadActual = nuevaCantidad;
        }

        return excedente; // Devolvemos lo que no cupo
    }

    @Override
    public double vacia() {
        double cantidadPrevia = cantidadActual; // Guardamos la cantidad antes de vaciar
        cantidadActual = 0; // Ahora sí, lo vaciamos
        return cantidadPrevia; // Devolvemos lo que tenía
    }

    @Override
    public void vierte(Recipiente otro) {
        // Checamos cuánto espacio hay en el otro recipiente
        double espacioDisponible = otro.capacidadRestante();
        // Calculamos cuánto podemos pasar realmente
        double cantidadAVerter = Math.min(cantidadActual, espacioDisponible);

        // Actualizamos ambos recipientes
        otro.cantidadActual += cantidadAVerter;
        cantidadActual -= cantidadAVerter;
    }

    @Override
    public boolean mismasDimensiones(Recipiente otro) {
        return this.radio == otro.radio && this.altura == otro.altura; // Comparación directa
    }

    @Override
    public boolean mismaCapacidad(Recipiente otro) {
        return this.capacidad() == otro.capacidad(); // Comparamos el volumen total
    }


    @Override
    public boolean contieneMas(Recipiente otro) {
        return this.cantidadActual > otro.cantidadActual; // Simple comparación
    }


    @Override
    public boolean cabeMas(Recipiente otro) {
        return this.capacidadRestante() > otro.capacidadRestante(); // Comparamos espacios disponibles

    }

    @Override
    public Recipiente creaContenedorJusto() {
        // Calculamos la altura necesaria para el nuevo recipiente
        double nuevaAltura = this.cantidadActual / (PI * radio * radio);
        return new Recipiente(this.radio, nuevaAltura); // Creamos uno nuevo con la altura calculada
    }

    @Override
public String muestra() {
    double porcentaje = (cantidadActual / capacidad()) * 100;
    String estado;

    if (porcentaje == 0) {
        estado = "VACÍO";
    } else if (porcentaje < 25) {
        estado = "CASI VACÍO";
    } else if (porcentaje < 50) {
        estado = "MEDIO VACÍO";
    } else if (porcentaje < 75) {
        estado = "MEDIO LLENO";
    } else if (porcentaje < 100) {
        estado = "CASI LLENO";
    } else {
        estado = "COMPLETAMENTE LLENO";
    }

    return "Recipiente (radio: " + radio + " cm, altura: " + altura + " cm)\n" +
           "Capacidad: " + capacidad() + " cc\n" +
           "Contenido: " + cantidadActual + " cc (" + porcentaje + "%)\n" +
           "Estado: " + estado;
}


    /**
     * Método toString que simplemente usa nuestro método muestra.
     */
    @Override
    public String toString() {
        return muestra(); // Reusamos el método muestra
    }
}
