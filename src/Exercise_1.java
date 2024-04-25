import java.util.Locale;
import java.util.Scanner;

// Read numbers of columns and rows, show the result and inputs of negative numbers
class Exercise_1 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Rows: ");
        int R = read.nextInt();
        System.out.print("Columns: ");
        int C = read.nextInt();

        float[][] matrix = new float[R][C];


        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrix[i][j] = n;
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Negative numbers: ");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
        read.close();
    }
}
