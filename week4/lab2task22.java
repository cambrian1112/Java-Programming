public class lab2task22 {
    public static void main(String[] args) {
        int x = 1, a = 3;

        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
                break;
            default:
                break;
        }
        System.out.println("The value of x is " + x);
    }
}