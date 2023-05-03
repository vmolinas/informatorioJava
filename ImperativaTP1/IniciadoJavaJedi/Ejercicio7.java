/*
 * Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
*/
package ImperativaTP1.IniciadoJavaJedi;

public class Ejercicio7 {
    public static void main(String[] args) {
        double real1 = 2.1;
        double real2 = 5.2;
        // System.out.println(real1*real2);
        int entero1 = 5;
        int entero2 = 7;
        // System.out.println(entero1*entero2);
        double suma = (real1*real2)+(entero1*entero2);
        System.out.println(suma);
    }
}