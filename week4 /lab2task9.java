import java.util.Scanner;

public class lab2task9 {

    public static void main(String[] args) {
        double monthlyDeposit = 100.0;  
        double annualInterestRate = 0.05; 
        double monthlyInterestRate = annualInterestRate / 12; 
        int months = 12; 
        double totalValue = 0.0; 
        for (int month = 1; month <= months; month++) {
            totalValue = (totalValue + monthlyDeposit) * (1 + monthlyInterestRate);
            System.out.println("After "+months+" months, the value in the account is "+totalValue);
        }
        System.out.printf("Total value after "+months+" months: "+totalValue);
    }
}
