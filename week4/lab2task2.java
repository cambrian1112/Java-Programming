import java.util.Scanner;
public class lab2task2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the second : ");
    int second=sc.nextInt();
    int minute=second/60;
    int remainingsecond=second%60;
    System.out.println("minute: "+minute);
    System.out.println("remainingsecond: "+remainingsecond);
    }
}
