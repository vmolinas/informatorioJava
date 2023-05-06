/*
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
*/

package ImperativaTP1.CaballeroJavaJedi;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de libras esterlinas: ");
        double libras = entrada.nextDouble();
        System.out.println("La cantidad en dólares es: " + (libras*1.40));
        entrada.close();
    }
}