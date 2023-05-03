/*
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
*/

package ImperativaTP1.PadawanJavaJedi;

public class Ejercicio5 {
    public static void main(String[] args) {
        double libra = 2.20462;
        double miPeso1 = 171.961;
        double miPeso2 = 174.61;
        double miPeso3 = 177.965;
        double peso1 = miPeso1/libra;
        double peso2 = miPeso2/libra;
        double peso3 = miPeso3/libra;
        System.out.println("Peso en libras: " + miPeso1 + " es: " + peso1 + " kg");
        System.out.println("Peso en libras: " + miPeso2 + " es: " + peso2 + " kg");
        System.out.println("Peso en libras: " + miPeso3 + " es: " + peso3 + " kg");
    }
}