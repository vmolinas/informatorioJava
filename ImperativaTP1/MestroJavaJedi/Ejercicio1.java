/*
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
*/

package ImperativaTP1.MestroJavaJedi;


public class Ejercicio1 {
    public static void main(String[] args) {
        double radio = 5;
        System.out.println("El área es: " + (Math.PI * radio * radio));
    }
}