/*
 * La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i, suma = 0;
        System.out.print("Ingrese un numero: ");
        n = entrada.nextInt();
        entrada.close();
        for (i = 1; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);
    }
}