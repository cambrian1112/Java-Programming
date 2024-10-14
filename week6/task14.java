public class w6task14 {
        public static void main(String[] args) {
            double tuition = 10000;
            double rate = 0.07; 
            double targetTuition = tuition * 2; 
            int years = 0;
    
            while (tuition < targetTuition) {
                tuition += tuition * rate; 
                years++;
            }
    
            System.out.println("Tuition will be doubled in " + years + " years");
            System.out.printf("Tuition will be $%.2f in %d years\n", tuition, years);
        }
    }
