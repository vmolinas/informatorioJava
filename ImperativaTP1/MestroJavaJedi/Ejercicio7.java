/*
 * Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria.
Muestre el resultado por pantalla.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = entrada.nextDouble();
        System.out.print("Ingrese la velocidad angular (rad/s): ");
        double velocidad = entrada.nextDouble();
        System.out.print("Ingrese el radio de la trayectoria (m): ");
        double radio = entrada.nextDouble();
        double f_c = masa * velocidad * velocidad / radio;
        System.out.print("La fuerza centrípeta es: " + f_c);
        entrada.close();
    }
}