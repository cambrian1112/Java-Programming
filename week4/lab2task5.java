import java.util.Scanner;
public class lab2task5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the subtotal and the gratuity :");
    double subtotal=sc.nextDouble();
    double gratuity=sc.nextDouble();
    double total=subtotal+gratuity*0.01*subtotal;
    System.out.println("the gratuity is "+gratuity*0.01*subtotal+" and total is "+total);
    }
}
