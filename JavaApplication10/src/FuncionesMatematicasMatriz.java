/**
 *Generar las funciones/métodos que devuelvan las suma, 
 *resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author Francis Tapia
 */
import java.util.Random;
public class FuncionesMatematicasMatriz {
    public static void main(String[] args) {
        int n = 3;
        int limite = 10;
        int[][] matriz1 = generarMatrizAleatoria(n, limite);
        int[][] matriz2 = generarMatrizAleatoria(n, limite);

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Suma de las matrices:");
        int[][] suma = sumarMatrices(matriz1, matriz2);
        imprimirMatriz(suma);
        System.out.println("Resta de las matrices:");
        int[][] resta = restarMatrices(matriz1, matriz2);
        imprimirMatriz(resta);
        System.out.println("Multiplicacion de las matrices:");
        int[][] multiplicacion = multiplicarMatrices(matriz1, matriz2);
        imprimirMatriz(multiplicacion);
    }
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
    public static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generarMatrizAleatoria(int n, int limite) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(limite);
            }
        }
        return matriz;
    }
}
