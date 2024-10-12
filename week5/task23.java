import java.util.Scanner;

public class w5task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        double r= sc.nextDouble();
        double s=2*r*Math.sin(3.14159/5);
        double area=(5*s*s)/(4*Math.tan(3.14159/5));
        System.out.println("THE AREA IS "+area); 
    }
}
