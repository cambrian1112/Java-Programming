import java.util.Scanner;

public class w5task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal value (0 - 15)");
        int n = sc.nextInt();
        if(n>=10 && n<=15)
        {
            System.out.println("hexadecimal value is "+(char)(n+55));
        }
        else if(n<10 && n>=0)
        {
            System.out.println("hexadecimal value is "+n);
        }
        else
        {
            System.out.println(n+"is a invalid input");
        }
    }
}
