import java.util.Scanner;
public class w5task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city1= input.nextLine();
        String city2= input.nextLine();
        if(city1.compareTo(city2)<0)
        {
            System.out.println(city1);
            System.out.println(city2);
        }
        else
        {
            System.out.println(city2);
            System.out.println(city1);
        }     
    }
    }
