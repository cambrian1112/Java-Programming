import java.util.Scanner;
public class t22 {
        // Method to find the smallest element in the array
    public static double min(double[] array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double minNumber = min(numbers);
        System.out.println("The minimum number is " + minNumber);
    }
}
