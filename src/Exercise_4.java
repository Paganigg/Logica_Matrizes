import java.util.Locale;
import java.util.Scanner;

// Read a square matrix, show the sum of main diagonal
class Exercise_4 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Square matrix: ");
        int S = read.nextInt();

        float[][] matrix = new float[S][S];
        float soma = 0;

        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrix[i][j] = n;
            }
            soma += matrix[i][i];
        }
        System.out.println("Sum of main diagonal");
        System.out.println(soma);
    }
}
