import java.util.Scanner;

public class h2$1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an int");
        int number =sc.nextInt() ;
        
        if (number%2==0 && number%3==0) {
            System.out.println(number + " is divisible by 2 and 3");
        }
        if (number%2==0 || number%3==0) {
            System.out.println(number + " is divisible by 2 or 3");
        }
        if (number%2==0 ^ number%3==0) {
            System.out.println(number + " is divisible by 2 or 3 , but not both");
        }
    }
    
}
