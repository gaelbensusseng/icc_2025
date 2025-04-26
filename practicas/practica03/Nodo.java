
public class Nodo {
    int elemento;    // El número que guarda este nodo.
    Nodo siguiente; // Apunta al siguiente nodo en la lista, o a null si es el último.

    // Constructor: le das el número y crea el nodo.
    public Nodo(int elemento) {
        this.elemento = elemento;
        this.siguiente = null; // Al inicio, no apunta a nadie.
    }

    // --- Getters y Setters
    public int getElemento() { return elemento; }
    public void setElemento(int elemento) { this.elemento = elemento; }
    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}

