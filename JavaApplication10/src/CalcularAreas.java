/**
 *Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, 
 *área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. 
 * Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 El área del cuadrado es igual a lado x lado x lado x lado
 El área del triángulo es igual a (base x altura)/2
 El área del rectángulo es igual a base x altura
 * @author franc
 */
import java.util.Scanner;
public class CalcularAreas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione una opcion (1 para el area de un cuadrado, 2 para el area de un triangulo y 3 para el area de un rectangulo)");
        opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                double lado, areaC;
                System.out.println("DEME EL TAMAÑO DE UN LADO DEL CUADRADO: ");
                lado = tcl.nextDouble();
                areaC = calcularAreaCuadrado(lado);
                System.out.println("El area del cuadrado es: " + areaC);
                break;

            case 2:
                double base, altura, areaT;
                System.out.println("DEME LA BASE Y LA ALTURA");
                base = tcl.nextDouble();
                altura = tcl.nextDouble();
                areaT = calcularAreaTriangulo(base, altura);
                System.out.println("El area del triangulo es: " + areaT);
                break;

            case 3:
                double baseR, alturaR, areaR;
                System.out.println("DEME LA BASE Y LA ALTURA");
                baseR = tcl.nextDouble();
                alturaR = tcl.nextDouble();
                areaR = calcularAreaRectangulo(baseR, alturaR);
                System.out.println("El area del rectangulo es: " + areaR);
                break;

            default:
                System.out.println("NO ELEGIBLE");
        }
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaRectangulo(double baseR, double alturaR) {
        return baseR * alturaR;
    }
}
/***
 * run:
 Seleccione una opcion (1 para el area de un cuadrado, 2 para el area de un triangulo y 3 para el area de un rectangulo)
 2
 DEME LA BASE Y LA ALTURA
 5 8
 El area del triangulo es: 20.0
 BUILD SUCCESSFUL (total time: 3 seconds)
 */