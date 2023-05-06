/*
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
*/

package ImperativaTP1.CaballeroJavaJedi;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros: ");
        double euros = entrada.nextDouble();
        double dolares = euros * 1.20;
        System.out.println(euros + " euros equivalen a " + dolares + " dólares");
        entrada.close();
    }
}