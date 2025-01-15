
/**
 *Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 *En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. 
 *Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 *En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble.
 *Y se genera el siguiente reporte:
 *Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 *En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Francis Tapia
 */
import java.util.Scanner;

public class ValorPlanillaLuz {
    public static void main(String[] args) {
        int opcion;
        String nombreCliente, cedulaCliente;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio de un bien inmueble");
        opcion = tcl.nextInt();
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = tcl.next();
        System.out.print("Ingrese la cedula del cliente: ");
        cedulaCliente = tcl.next();

    switch (opcion) {
            case 1:
                calcularValorLuz(tcl, nombreCliente, cedulaCliente);
                break;
            case 2:
                calcularPredio(tcl, nombreCliente, cedulaCliente);
                break;
            default:
                System.out.println("Opcion no válida.");
                break;
        }

    }

    public static void calcularValorLuz(Scanner tcl, String nombreCliente, String cedulaCliente) {
        double valorKilovatio, numKilovatios, totalPagar;
        System.out.print("Ingrese el valor del kilovatio: ");
        valorKilovatio = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos: ");
        numKilovatios = tcl.nextDouble();
        totalPagar = valorKilovatio * numKilovatios;
        System.out.println("Cliente " + nombreCliente + " con cedula " + cedulaCliente + " debe cancelar el valor de $" + totalPagar);
    }
    public static void calcularPredio(Scanner tcl, String nombreCliente, String cedulaCliente) {
        double valorInmueble, valorPredio;
        System.out.print("Ingrese el valor del inmueble: ");
        valorInmueble = tcl.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente + " tiene un bien inmueble valorado en $" + valorInmueble + " y tiene que pagar de predio $" + valorPredio);
    }
}
/***
 * run:
 Seleccione una opcion:
 1. Calcular valor de la planilla de luz
 2. Calcular valor del predio de un bien inmueble
 1
 Ingrese el nombre del cliente: Fernando Perez
 Ingrese la cedula del cliente: Ingrese el valor del kilovatio: 11574820 25
 Ingrese el numero de kilovatios consumidos: Cliente Fernando con cedula Perez debe cancelar el valor de $2.893705E8
 BUILD SUCCESSFUL (total time: 17 seconds)
 */
