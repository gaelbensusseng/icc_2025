Gael Bensussen Gonzalez 

Descripción del proyecto: El trabajo consistió en desarrollar funciones capaces de extraer mensajes ocultos dentro de textos, aplicando distintas técnicas. 

Implementamos métodos para manejar:

    El Cifrado Nulo, tanto cuando se da el índice directamente como cuando este se infiere contando espacios al final del texto.
    La Búsqueda de Nombres Ocultos, donde tuvimos que procesar el texto para ignorar mayúsculas, minúsculas, espacios y otros signos.
    La recuperación de mensajes mediante Marcado de Palabras y Marcado de Letras, comparando dos textos para encontrar las diferencias que forman el mensaje secreto.

Dado que una de las reglas era no usar arreglos ni listas estándar de Java, nos centramos mucho en la manipulación directa de Strings y el uso de Scanners para procesar la información palabra por palabra o carácter por carácter. El archivo Esteganografia.java incluye también una función main con un menú simple para poder probar cada una de las funcionalidades desarrolladas.

instrucciones de uso: 

javac *.java -> java Main 

-------------------------------
Inconvenientes presentados: Tuve un pequeño inconveniente al implementar el metodo descifraNulo(), ya que al principo no tenia claro como contar los espacios finales sin afectar a los espacios que no podian estar en el incio o entre palabras, lo resolvi recorriendo la cadena desde el ultimo char hacia atras, contando los espacios hasta encontrar un caracter distinto. Asi pude extraer correctamente ña subcadena sin incluir los espacios que mencione
