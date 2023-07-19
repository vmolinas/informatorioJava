/*
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas del triangulo: ");
        int n = entrada.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        entrada.close();
    }
}