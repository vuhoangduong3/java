import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("m =  ");
        int m = keyboard.nextInt();
        System.out.print("n = ");
        int n = keyboard.nextInt();
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];
        int[][] sumMatrix = new int[m][n];
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixA[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixB[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Sum Matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}


