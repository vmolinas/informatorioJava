/*
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
*/

package ImperativaTP1.CaballeroJavaJedi;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dólares: ");
        double dolares = entrada.nextDouble();
        double pesos = dolares * 380.00;
        System.out.println("La cantidad de pesos es: " + pesos);
        entrada.close();
    }
}