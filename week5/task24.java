import java.util.Scanner;

public class w5task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a letter");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is a vowel");
        }        
        else if(ch>='A'&& ch <='Z'|| ch>='a'&& ch <='z')
        {
            System.out.println(ch+" is a consonant");
        }
        else
        {
            System.out.println(ch+" is an invalid input");
        }
    }
}
