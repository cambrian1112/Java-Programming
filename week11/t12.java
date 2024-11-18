import java.util.Scanner;

public class t12 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row:");
        
        // Initialize a 3x4 matrix
        double[][] matrix = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int k = 0; k < 4; k++) {
            double sum = sumColumn(matrix, k);
            System.out.println("Sum of the elements at column " + k + " is " + sum);
        }

        scanner.close();
    }
}