import java.util.Scanner;

public class lab2task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double TAX_RATE = 0.06;
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * TAX_RATE;
        double roundedTax = Math.round(tax * 100.0) / 100.0;
        System.out.printf("Sales tax is "+ roundedTax);

        input.close();
    }
}
