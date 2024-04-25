import java.util.Locale;
import java.util.Scanner;

// Read numbers of columns and rows of two integer matrix, A and B, show a matrix of the sum of A and B
class Exercise_5 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Rows: ");
        int R = read.nextInt();
        System.out.print("Columns: ");
        int C = read.nextInt();

        float[][] matrixA = new float[R][C];
        float[][] matrixB = new float[R][C];
        float[][] matrixC = new float[R][C];

        System.out.println("Matrix A");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrixA[i][j] = n;
                }
        }
        System.out.println();
        System.out.println("Matrix B");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrixB[i][j] = n;
            }
        }
        System.out.println();
        System.out.println("Matrix C:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrixC[i][j] = matrixB[i][j] + matrixA[i][j];
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

    }
}

