/**
 *Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
 *si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno
 *De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un método principal.
 *los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author Francis Tapia
 */
import java.util.Scanner;
public class FuncionPromedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese cuatro valores decimales para calcular el promedio cualitativo.");
        System.out.print("Ingrese el primer numero: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double n3 = tcl.nextDouble();
        System.out.print("Ingrese el cuarto numero: ");
        double n4 = tcl.nextDouble();
        String resultado = obtenerPromCualitativo(n1, n2, n3, n4);
        System.out.println("El promedio cualitativo es: " + resultado);
    }
    public static String obtenerPromCualitativo(double n1, double n2, double n3, double n4) {
        double promedio = (n1 + n2 + n3 + n4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Valor fuera de rango";
        }
    }
}
/***
 * run:
 Ingrese cuatro valores decimales para calcular el promedio cualitativo.
 Ingrese el primer numero: 3
 Ingrese el segundo numero: 5,9
 Ingrese el tercer numero: 6,4
 Ingrese el cuarto numero: 2
 El promedio cualitativo es: Regular
 BUILD SUCCESSFUL (total time: 9 seconds)
 */