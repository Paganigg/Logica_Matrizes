import java.util.Locale;
import java.util.Scanner;

// Read a square matrix, show the biggests numbers in each line
class Exercise_3 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Square matrix: ");
        int S = read.nextInt();

        float[][] matrix = new float[S][S];
        float[] high = new float[S];

        for (int i = 0; i < S; i++) {
            float higher = 0;
            for (int j = 0; j < S; j++) {
                System.out.print("Number: ");
                float n = read.nextFloat();
                matrix[i][j] = n;
                if (n > higher) {
                    higher = n;
                }

            }
            high[i] = higher;
        }
        System.out.println("Biggest numbers");
        for (int i = 0; i < high.length; i++) {
            System.out.println(high[i]);
        }
    }
}

