import java.util.Scanner;

public class lab2task10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double ANNUAL_INTEREST_RATE = 0.05;
        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();
        double accountValue = 0;
        for (int i = 0; i < months; i++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + MONTHLY_INTEREST_RATE);
        }
        System.out.println("After "+months+" months, the value in the account is "+accountValue);
    }
}
