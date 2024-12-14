import java.util.Scanner;
public class lab2task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weight=sc.nextDouble();
        System.out.println("Enter the height: ");
        double height=sc.nextDouble();
        double kilo=weight*0.45359237;
        double h=height*0.0254;
        double bmi=kilo/(h*h);
        System.out.println("bmi is "+bmi);
    }
}
