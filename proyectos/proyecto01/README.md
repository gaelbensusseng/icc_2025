Gael Bensussen Gonzalez. 

DESCRIPCIÓN BREVE DEL PROYECTO: 

El proyecto implementa una clase llamada Recipiente que modela un contenedor de forma cilíndrica que contiene un líquido. 
La clase importa los metodos de nuestra interfáz "ServiciosRecipiente" a una nuestra clase "Recipiente", definí los atributos y parámetros necesarios para modelar y gestionar el volúmen del líquido y las restricciones dentro del contenedor cilíndrico, dentro de una clase "Main", se prueban estos mismos métodos, permitiendo realizar acciones tales como el poder llenar el cilindro de líquido, el poder vaciarlo, transerir su líquido a otro recipiente y poder mostrar el porcentaje de su contenido, evitando que se exceda el contenido permitido.

INCONVENIENTES: 

Llegué a presentar algunos inconvenientes a la hora de realizar mi proyecto, al principio no sabia porque la clase Recipiente me daba el error "the return type is incompatible with serviciosRecipiente.rellena(double)", pero investigué y descubrí que el problema estaba en la firma de mi método, haciendo que hubiera un problema de compatibilidad entre mi interfáz y mi clase Recipiente, ya que los parámetros de los métodos de mi clase Recipiente debian de ser EXACTAMENTE IGUALES a los de la interfaz si es que queria usarlos. En general presenté algunos otros problemas más con la compatibilidad entre la interfaz y la clase Recipiente, pero al final logré solucionarlos. 

INSTRUCCIONES DE USO:

Después de descargar el repositorio, ejecutar los siguientes comandos en la 
terminal: 

1) javac *.java 

2) java Main

Por último, se deberia de desplegar un menu con unos parametros que ponen a prueba 
los métodos del programa, en caso de querer modificar la salida del método Main, 
modificar directamente en el código los parámetros que se deseen probar.  

Gracias :). 
