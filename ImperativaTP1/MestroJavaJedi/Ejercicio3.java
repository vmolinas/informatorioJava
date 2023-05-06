/*
 * Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
*/

package ImperativaTP1.MestroJavaJedi;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el cateto uno: ");
        double catetoUno = entrada.nextDouble();
        System.out.print("Ingrese el cateto dos: ");
        double catetoDos = entrada.nextDouble();
        double hipotenusa = Math.sqrt((catetoUno * catetoUno) + (catetoDos * catetoDos));
        System.out.println("La hipotenusa es: " + hipotenusa);
        entrada.close();
    }
}