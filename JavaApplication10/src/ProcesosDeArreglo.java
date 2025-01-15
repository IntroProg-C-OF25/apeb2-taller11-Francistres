/**
 *Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 *El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); 
 *además el método debe recibir como parámetro un arreglo bidimensional.
 * @author Francis Tapia
 */
import java.util.Scanner;

public class ProcesosDeArreglo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limiteF = 0, limiteC = 0;
        System.out.print("DAME EL LIMITE DE LAS FILAS Y DE LAS COLUMNAS");
        limiteF = tcl.nextInt();
        limiteC = tcl.nextInt();
        int matriz[][] = new int [limiteF][limiteC];
        generarMatriz(matriz);
        System.out.println("Matriz generada: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromMatriz(matriz);
        
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void presentarParImparMatriz(int matriz[][]){
        System.out.println("ELEMENTOS PARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //otra forma System.out.println(matriz[i][j] %2 == 0) ? matriz[i][j : ""];
                if (matriz[i][j] %2 == 0)
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println ("");
        }      
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //otra forma System.out.println(matriz[i][j] %2 != 0) ? matriz[i][j : ""];
                if (matriz[i][j] %2 != 0)
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void presentarPromMatriz(int matriz[][]){
        int sumaMatriz = 0, promMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("PROMEDIO MATRIZ " + promMatriz);
    }
}