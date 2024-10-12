import java.util.Scanner;

public class w5task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first city :");
        String city1 = sc.nextLine();
        System.out.println("enter the second city :");
        String city2 = sc.nextLine();
        System.out.println("enter the third city :");
        String city3 = sc.nextLine();
        if(city1.compareTo(city2)>0 && city1.compareTo(city3)>0)
        {
            if(city2.compareTo(city3)>0)
            {
                System.out.println("the three cities in alphabetical order are "+ city3 + " " + city2 + " " + city1);
            }
            else
            {
                System.out.println("the three cities in alphabetical order are "+ city2 + " " + city3 + " " + city1);
            }
        }
        else if(city2.compareTo(city3)>0 && city2.compareTo(city1)>0)
        {
            if(city3.compareTo(city1)>0)
            {
                System.out.println("the three cities in alphabetical order are "+ city1 + " " + city3 + " " + city2);
            }
            else
            {
                System.out.println("the three cities in alphabetical order are "+ city3 + " " + city1 + " " + city2);
            }
        }
        else if(city3.compareTo(city1)>0 && city3.compareTo(city2)>0)
        {
            if(city1.compareTo(city2)>0)
            {
                System.out.println("the three cities in alphabetical order are "+ city2 + " " + city1 + " " + city3);
            }
            else
            {
                System.out.println("the three cities in alphabetical order are "+ city1 + " " + city2 + " " + city3);
            }
        }
        else
        {
            System.out.println("there are same");
        }
    }
}
