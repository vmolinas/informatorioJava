/*
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
*/

package ImperativaTP1.CaballeroJavaJedi;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de bitcoins: ");
        double bitcoins = entrada.nextDouble();
        double tasa = 50000.0;
        double dolares = bitcoins * tasa;
        System.out.println("La cantidad en dólares es: " + dolares);
        entrada.close();
    }
}