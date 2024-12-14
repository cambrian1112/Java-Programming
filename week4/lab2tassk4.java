import java.util.Scanner;
public class lab2tassk4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius=sc.nextDouble();
        System.out.println("Enter the length : ");
        double length=sc.nextDouble();
        double area=radius*radius*3.14159;
        double volume= area*length;
        System.out.println("the area is "+area);
        System.out.println("the volume is "+volume);
    }
}
