/*
 * Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
Muestre el resultado por pantalla.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n, media, i;
            System.out.print("Ingrese el numero de elementos: ");
            n = entrada.nextInt();
            int[] numeros = new int[n];
            System.out.print("Ingrese los numeros: ");
            for (i = 0; i < n; i++) {
                numeros[i] = entrada.nextInt();
            }
            media = 0;
            for (i = 0; i < n; i++) {
                media = media + numeros[i];
            }
            media = media / n;
            System.out.println("La media es: " + media);
            entrada.close();
        }
    }
}