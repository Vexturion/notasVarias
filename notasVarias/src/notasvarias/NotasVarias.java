package notasvarias;

import duran.alejandro.notasvarias2.Java;  // la estructura para importar es import y 
                                           // el nombre del paquete de donde hemos de importar, seguido de un punto y 
// el import va antes de la                // la clase que vamos a importar o bien .* que importara todas las clases
// declaracion de la clase                 // de ese paquete

public class NotasVarias {

    public static void main(String[] args) {
// utilizar el API de Java
System.out.println(Math.PI); // pi es un atributo estatico de la clase math por lo que no requiere ser instanciado
System.out.println(Math.max(200, 500));  // el metodo math.max retorna el valor mas alto de entre dos valores

// paquetes        
// un paquete nos permite organizar un frupo de clases que se relacionan entre si
// resuelven la problematica de conflicto de nombres
// nos permiten establecer privilegios de acceso

// paquetes
// para nombrar paquetes seguiremos estas reglas
// utilizaremos unicamente letras minusculas
// separar con puntos
// utilizaremos nuestro dominio o nombre al reves ex. duranalejandro
// pondremos al final el contexto del paquete, bajo el cual agruparemos las clases
// cada punto definira una carpeta, por eso es que es al reves
// duran.alejandro.notasvarias
// para hacer una carpeta en alejandro lo hariamos de esta manera
// duran.alejandro.notasvarias2(nueva carpeta) y estaria en la misma carpeta que notasvarias 

// ejemplo del uso de import para la instancia de un objeto de la clase importada y el uso de sus metodos
Java java = new Java ();
System.out.println(java.getTitulo());

// java lang
double resultado = Math.sqrt(25);
String mensaje = "Resultado " + resultado;
System.out.println(mensaje);
// las clases en el paquete java lang podran usarse sin el metodo import

// protected
Java java2 = new Java ();
System.out.println(java.getTitulo());
// nuestro metodo .getTitulo es publico actualmente, si lo cambiamos a default o protected
// clases de otros paquetes no podran hacer uso de esos metodos, a pesar de que se utilice import
// default o protected limitaran el acceso a clases que sean unicamente del mismo paquete











    }
    
}
