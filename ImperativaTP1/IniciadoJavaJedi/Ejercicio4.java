/*
 * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.
*/

package ImperativaTP1.IniciadoJavaJedi;

public class Ejercicio4 {
    public static void main(String[] args) {
        int uno = 15;
        int dos = 3;
        int resultado = uno + dos;
        if (uno%dos == 0) {
            System.out.println("El resultado es " + resultado + " y " + uno + " es dividible entre " + dos);
        } else {
            System.out.println("El resultado es " + resultado + " y " + uno + " no es dividible entre " + dos);
        }
    }
}