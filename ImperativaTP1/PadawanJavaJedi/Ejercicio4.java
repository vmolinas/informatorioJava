/*
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
*/

package ImperativaTP1.PadawanJavaJedi;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre1 = "Adan";
        int edad1 = 33;
        String nombre2 = "Carina";
        int edad2 = 31;
        String nombre3 = "Nelson";
        int edad3 = 29;
        String nombre4 = "Victor";
        int edad4 = 62;
        double promedio = (edad1+edad2+edad3+edad4)/4;
        System.out.println(nombre1 + ": " + edad1 + " años");
        System.out.println(nombre2 + ": " + edad2 + " años");
        System.out.println(nombre3 + ": " + edad3 + " años");
        System.out.println(nombre4 + ": " + edad4 + " años");
        System.out.println(promedio);
    }
}