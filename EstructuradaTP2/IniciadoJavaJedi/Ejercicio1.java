/*
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero: ");
        n = entrada.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}