public class lab2task13 {
    public static void main(String[] args) {
        double pay = 1000.00; 
        int score = 95; 
        if (score > 90) {
            pay *= 1.03; 
        } else {
            pay *= 1.01; 
        }
        System.out.printf("The new pay is: "+pay);
    }
}