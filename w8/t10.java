import java.util.Scanner;

public class t10 {
public static void main(String[] args) {
String[] months = {"January", "February", "March", "April","May", "June", "July", "August","September", "October", "November", "Decemeber"};
System.out.print("Enter a month number (1 to 12): ");
Scanner input = new Scanner(System.in);
int monthNumber = input.nextInt();
input.close();
System.out.println("The month is "+ months[monthNumber-1]);
}
}
