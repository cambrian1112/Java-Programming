public class t11 {
    public static void main(String[] args) {
        int[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }

        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[i] < totalHours[j]) {
                    int temp = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = temp;
                    int[] tempWorkHours = workHours[i];
                    workHours[i] = workHours[j];
                    workHours[j] = tempWorkHours;
                }
            }
        }

        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("employees " + i + ": " + totalHours[i] + " hours");
        }
    }
}
