public class w5task21 {
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s%-10s%-10sin", "Degrees", "Radians","Sine", "Cosine", "Tangent");
        
        int degrees=30;
        double radians = Math.toRadians(degrees);
        
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4fin", degrees, radians,Math.sin(radians),Math.cos(radians), Math.tan(radians));
        
        degrees=60;
        
        radians=Math.toRadians(degrees);
        
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
}
}
