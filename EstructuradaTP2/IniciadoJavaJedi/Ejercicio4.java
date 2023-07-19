/*
 * De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        entrada.close();
    }
}