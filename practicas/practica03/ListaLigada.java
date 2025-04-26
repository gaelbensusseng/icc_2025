// ListaLigada.java
// Maneja la cadena de nodos. Sabe dónde empieza (cabeza) y cuántos hay.
public class ListaLigada {
    Nodo cabeza;  // El primer nodo de la lista. Si es null, está vacía.
    int longitud; // Cuántos nodos tenemos.

    // Constructor: crea una lista vacía.
    public ListaLigada() {
        this.cabeza = null;
        this.longitud = 0;
    }

    // Checa si la lista está vacía.
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Devuelve cuántos elementos hay.
    public int getLongitud() {
        return longitud;
    }

    // Inserta un elemento AL FINAL de la lista.
    public void insertar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (estaVacia()) {
            cabeza = nuevoNodo; // Si está vacía, es el primero.
        } else {
            Nodo actual = cabeza;
            // Avanza hasta encontrar el último nodo.
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo); // Engancha el nuevo al final.
        }
        longitud++; // Incrementa el contador.
    }

    // Elimina la primera aparición de un elemento en la lista.
    public void eliminar(int elemento) {
        if (estaVacia()) {
            System.out.println("No hay nada que eliminar, la lista está vacía.");
            return; // Si está vacía, no hace nada.
        }

        // Si el que queremos borrar es el primero:
        if (cabeza.getElemento() == elemento) {
            cabeza = cabeza.getSiguiente(); // La cabeza ahora es el segundo.
            longitud--;
            System.out.println("Elemento " + elemento + " eliminado (era la cabeza).");
            return;
        }

        // Si no es el primero, busca el nodo ANTERIOR al que queremos borrar.
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && actual.getSiguiente().getElemento() != elemento) {
            actual = actual.getSiguiente(); // Avanza.
        }

        // Si encontramos el nodo a borrar (actual.siguiente es el bueno)...
        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Se lo salta.
            longitud--;
            System.out.println("Elemento " + elemento + " eliminado.");
        } else {
            // Si llegamos al final y no lo encontramos...
            System.out.println("Elemento " + elemento + " no encontrado en la lista.");
        }
    }

    // Convierte la lista a un String para poder imprimirla fácil.
    @Override
    public String toString() {
        if (estaVacia()) {
            return "Lista vacía";
        }
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.getElemento());
            if (actual.getSiguiente() != null) {
                sb.append(","); // comita que separa los elementos de la lista
            }
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }

    // --- PUNTO EXTRA ---
    // Inserta un elemento en un índice específico.
    // El índice debe ser válido: 0 <= indice <= longitud - 1
    public void insertarIndice(int elemento, int indice) {
        // Validación estricta del índice según la práctica.
        if (indice < 0 || indice >= longitud) { // Nota: >= longitud porque el índice máximo válido es longitud-1
            System.out.println("Índice " + indice + " fuera de rango (válidos: 0 a " + (longitud - 1) + "). No se insertó " + elemento + ".");
            return; // Si el índice no es válido, no hace nada.
        }

        Nodo nuevoNodo = new Nodo(elemento);

        // Si es en el índice 0, es la nueva cabeza.
        if (indice == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
            // Busca el nodo ANTERIOR a la posición donde queremos insertar.
            Nodo actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.getSiguiente();
            }
            // Inserta el nuevo nodo entre 'actual' y 'actual.siguiente'.
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
        longitud++; // Incrementa el tamaño.
        System.out.println("Elemento " + elemento + " insertado en índice " + indice + ".");
    }
}