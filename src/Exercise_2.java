import java.util.Locale;
import java.util.Scanner;

//Square matrix, a vector show the sum of rows
public class Exercise_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Square matrix : ");
        int S = read.nextInt();

        float[][] matrix = new float[S][S];
        float[] sum = new float[S];

        for (int i = 0; i < S; i++) {
            float soma = 0;
            for (int j = 0; j < S; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrix[i][j] = n;
                soma += matrix[i][j];
            }
            sum[i] = soma;
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
