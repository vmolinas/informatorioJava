/*
 * Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
El mensaje debe tener el siguiente formato:
“El resultado es “ {Resultado} “y es” {paridad}
*/

package Imperativa.IniciadoJavaJedi;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroUno = 2;
        int numeroDos = 1;
        int resultado = numeroUno + numeroDos;
        String paridad = "";
        if (resultado%2 == 0) {
            paridad = "par";
        }else{
            paridad = "impar";
        }
        System.out.println("El resultado es " + resultado + " y es " + paridad);
    }
}