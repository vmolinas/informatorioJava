/*
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo usando arrays.
*/

package EstructuradaTP2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] amigos = new String[100];
        int n;
        System.out.println("Ingrese la cantidad de amigos: ");
        n = sc.nextInt();
        System.out.println("Ingrese el nombre de los amigos: ");
        for (int i = 0; i < n; i++) {
            amigos[i] = sc.next();
            }
            System.out.println("Los amigos son: ");
            for (int i = 0; i < n; i++) {
                System.out.println(amigos[i]);
                }
    sc.close();
    }
}