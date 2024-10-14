public class w6task12 {
        public static void main(String[] args) {
            int count = 0; 
            int number = 2; 
            final int NUMBERS_PER_LINE = 10; 
    
            while (count < 50) {
                if (isPrime(number)) {
                    count++;
                    System.out.print(number + " ");
                    if (count % NUMBERS_PER_LINE == 0) {
                        System.out.println(); 
                    }
                }
                number++;
            }
        }
    
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

