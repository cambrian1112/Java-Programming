import java.util.Random;

public class t13 {
    public static void main(String[] args) {
        // 创建一个4x4的矩阵
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 使用0和1随机填充矩阵
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2); // 0 或 1
            }
        }

        // 打印矩阵
        System.out.println("Generated Matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        // 找出含有最多1的行和列
        int maxOnesRow = 0;
        int maxOnesCol = 0;
        int maxRowOnes = 0;
        int maxColOnes = 0;

        for (int i = 0; i < 4; i++) {
            int currentRowOnes = 0;
            int currentColOnes = 0;
            for (int j = 0; j < 4; j++) {
                currentRowOnes += matrix[i][j];
                currentColOnes += matrix[j][i];
            }
            if (currentRowOnes > maxRowOnes) {
                maxRowOnes = currentRowOnes;
                maxOnesRow = i;
            }
            if (currentColOnes > maxColOnes) {
                maxColOnes = currentColOnes;
                maxOnesCol = i;
            }
        }

        // 打印结果
        System.out.println("The largest row index: " + maxOnesRow);
        System.out.println("The largest column index: " + maxOnesCol);
    }
}