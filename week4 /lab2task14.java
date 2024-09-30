import java.util.Scanner;

public class lab2task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUNDS_TO_KILOGRAMS = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double weight = weightInPounds * POUNDS_TO_KILOGRAMS;
        double heightInMeters = height * INCHES_TO_METERS;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("BMI is "+bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
