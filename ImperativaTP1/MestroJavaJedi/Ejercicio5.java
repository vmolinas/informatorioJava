/*
 * Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la velocidad: ");
        double velocidad = entrada.nextDouble();
        System.out.print("Ingrese la masa: ");
        double masa = entrada.nextDouble();
        double energia = (0.5 * masa * velocidad * velocidad);
        System.out.println("La energía cinética es: " + energia);
        entrada.close();
    }
}