/*
 * A mi me gustan los pares: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i, j;
        System.out.print("Ingrese un número: ");
        n = entrada.nextInt();
        i = 1;
        j = n;
        System.out.println("Los números pares son:");
        while (i <= j) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        entrada.close();
    }
}