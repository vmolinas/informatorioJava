/*
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
*/

package ImperativaTP1.CaballeroJavaJedi;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesos, euros;
        System.out.print("Ingrese cantidad de pesos: ");
        pesos = entrada.nextDouble();
        double tasa = 400.0;
        euros = pesos / tasa;
        System.out.println("Euros: " + euros);
        entrada.close();
    }
}