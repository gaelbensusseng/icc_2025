import java.util.Scanner;
public class Esteganografia{

    /**
     * Obtiene la n-ésima letra de cada palabra para formar el mensaje oculto.
     * Ignora palabras más cortas que n.
     *
     * @param original El mensaje original.
     * @param n El índice (1-based) de la letra a tomar de cada palabra.
     * @return El mensaje oculto, sin espacios.
     */
    public String descifraNulo(String original, int n) {
        // Se usa Scanner para obtener palabras sin usar split() (restricción del proyecto).
        Scanner lectorPalabras = new Scanner(original);
        String mensajeOculto = "";

        while (lectorPalabras.hasNext()) {
            String palabra = lectorPalabras.next();
            // Verificar si la palabra tiene longitud suficiente (n>0 ya se valida en main).
            // Se usa n-1 porque los índices de String son 0-based.
            if (palabra.length() >= n) {
                mensajeOculto += palabra.charAt(n - 1);
            }
        }
        lectorPalabras.close(); // Cerrar el scanner.
        return mensajeOculto;
    }

    /**
     * Obtiene la n-ésima letra de cada palabra, donde n se determina
     * contando los espacios al final del texto original.
     *
     * @param original El mensaje original (puede tener espacios al final).
     * @return El mensaje oculto, sin espacios.
     */
    public String descifraNulo(String original) {
        int n = 0; // Índice a determinar.
        String textoSinEspaciosFinales = original;

        // Contar espacios al final iterando desde atrás.
        for (int i = original.length() - 1; i >= 0; i--) {
            if (original.charAt(i) == ' ') {
                n++;
            } else {
                // Guardar la parte del texto sin los espacios finales.
                textoSinEspaciosFinales = original.substring(0, i + 1);
                break; // Detener al encontrar el primer caracter no espacio.
            }
        }
        // Si todo eran espacios, n será length y textoSinEspaciosFinales estará vacío.

        // Reutilizar el método anterior con el n calculado.
        return descifraNulo(textoSinEspaciosFinales, n);
    }


    /**
     * Busca un nombre dentro de un texto, ignorando mayúsculas/minúsculas,
     * espacios y signos de puntuación.
     *
     * @param mensaje Texto donde se realizará la búsqueda.
     * @param nombre Nombre a buscar.
     * @return true si el nombre (limpio) se encuentra en el mensaje (limpio), false en caso contrario.
     */
    public boolean contieneNombre(String mensaje, String nombre) {
        String mensajeLimpio = "";
        String nombreLimpio = "";

        //mantenemos solo letras y convertimos a minúsculas.
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isLetter(caracter)) {
                mensajeLimpio += Character.toLowerCase(caracter);
            }
        }

        // Limpia el nombre
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            if (Character.isLetter(caracter)) {
                nombreLimpio += Character.toLowerCase(caracter);
            }
        }


        // Un nombre vacío no retorna nada 
        if (nombreLimpio.isEmpty()) {
            return false;
        }
        return mensajeLimpio.contains(nombreLimpio);
    }

    /**
     * Reconstruye un mensaje oculto comparando dos textos palabra por palabra.
     * Las palabras diferentes del primer texto (m) forman el mensaje.
     *
     * @param m Texto original.
     * @param e Texto con palabras "marcadas" (diferentes a m).
     * @return El mensaje oculto con palabras separadas por espacio.
     */
    public String descifraPalabrasMarcadas(String m, String e) {
        // Usa dos Scanners para iterar palabras en paralelo.
        Scanner scannerM = new Scanner(m);
        Scanner scannerE = new Scanner(e);
        String mensajeOculto = "";

        // Compara mientras ambos textos tengan palabras.
        while (scannerM.hasNext() && scannerE.hasNext()) {
            String palabraM = scannerM.next();
            String palabraE = scannerE.next();

            // Si las palabras en la misma posición son diferentes...
            if (!palabraM.equals(palabraE)) {
                // ...añade la palabra de M al resultado, seguida de un espacio.
                mensajeOculto += palabraM + " ";
            }
        }

        scannerM.close();
        scannerE.close();

        // Elimina el posible espacio extra al final.
        return mensajeOculto.trim();
    }

    /**
     * Reconstruye un mensaje oculto comparando dos textos letra por letra.
     * Las letras diferentes del primer texto (m) forman el mensaje.
     * Se asume que las palabras correspondientes tienen la misma longitud.
     *
     * @param m Texto original.
     * @param e Texto con letras "marcadas" (diferentes a m).
     * @return El mensaje oculto formado por las letras diferentes, sin espacios.
     */
    public String descifraLetrasMarcadas(String m, String e) {
        Scanner scannerM = new Scanner(m);
        Scanner scannerE = new Scanner(e);
        String mensajeOculto = "";

        // Itera sobre las palabras de ambos textos.
        while (scannerM.hasNext() && scannerE.hasNext()) {
            String palabraM = scannerM.next();
            String palabraE = scannerE.next();

            // Itera sobre los caracteres de las palabras (asumiendo igual longitud).
            for (int i = 0; i < palabraM.length(); i++) {
            
                if (palabraM.charAt(i) != palabraE.charAt(i)) {
                
                    mensajeOculto += palabraM.charAt(i);
                }
            }
        }

        scannerM.close();
        scannerE.close();

        return mensajeOculto; // No requiere trim.
    }

    
}
