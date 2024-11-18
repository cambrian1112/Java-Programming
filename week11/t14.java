import java.util.Random;

public class t14 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffleMatrix(m);
        printMatrix(m);
    }

    public static void shuffleMatrix(int[][] matrix) {
        int height = matrix.length;
        Random rand = new Random();
        for (int i = 0; i < height; i++) {
            // Generate a random index to swap with.
            int randomIndex = rand.nextInt(height);
            // Swap the current row with the random row.
            int[] temp = matrix[i];
            matrix[i] = matrix[randomIndex];
            matrix[randomIndex] = temp;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
