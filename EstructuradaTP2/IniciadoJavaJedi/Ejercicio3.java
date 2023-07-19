/*
 * Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero : ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
        entrada.close();
    }
}