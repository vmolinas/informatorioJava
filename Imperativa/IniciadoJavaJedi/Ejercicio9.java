/*
 * Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.
*/

package Imperativa.IniciadoJavaJedi;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = 10;
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        System.out.println("El cuadrado es " + cuadrado + " y el cubo es " + cubo);
    }
}