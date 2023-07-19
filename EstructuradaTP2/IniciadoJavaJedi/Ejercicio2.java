/*
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de amigos: ");
        n = entrada.nextInt();
        String[] amigos = new String[n];
        System.out.println("Ingrese el nombre de los amigos:");
        for (int i = 0; i < n; i++) {
            amigos[i] = entrada.next();
        }
        System.out.println("--------------------------");
        System.out.println("Los amigos son:");
        for (int i = 0; i < n; i++) {
            System.out.println(amigos[i]);
        }
        entrada.close();
    }
}