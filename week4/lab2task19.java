import java.util.Scanner;

public class lab2task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        boolean isCorrect = (number1 + number2 == answer);

        if (isCorrect) {
            System.out.println("True");
        } else {
            System.out.println("False");
            System.out.println("The correct answer is " + (number1 + number2));
        }
    }
}