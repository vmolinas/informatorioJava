/*
 * Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
Muestre el resultado por pantalla.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double gravedad = 9.8;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la velocidad inicial: ");
        double velocidadInicial = entrada.nextDouble();
        System.out.print("Ingrese el tiempo transcurrido: ");
        double tiempo = entrada.nextDouble();
        double velocidadFinal = velocidadInicial + (gravedad * tiempo);
        System.out.println("La velocidad final es: " + velocidadFinal);
        entrada.close();
    }
}