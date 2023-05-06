/*
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        entrada.close();
    }
}