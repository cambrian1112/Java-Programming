public class t16 {
    public static void main(String[] args) {
    int x=1;
    int[]y=new int[10];
    System.out.println("Value of x before: " + x);
    System.out.println("Value of y[0] before: " + y[0]);
    System.out.println("Value of x after: " + x);
    test(x, y);
    System.out.println("Value of y[0] after: " + y[0]);
}
    public static void test(int number, int[] numbers){
    number =2;//Assign a new value to a number
    numbers [0] =5;
}
}
