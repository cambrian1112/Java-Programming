public class w5task14 {
    public static void main(String[] args) {
        String sl ="Welcome to Java";
        String s2 ="Welcome to Java";
        String s3 = "Welcome to C++";//equals
        System.out.println(sl.equals(s2));
        System.out.println(sl.equals(s3));
        
        System.out.println(sl.compareTo(s2));
        
        System.out.println(sl.compareTo(s3));// startsWith
        
        System.out.println(sl.startsWith("We"));
        
        System.out.println(sl.startsWith("we"));//endsWith
        
        System.out.println(sl.endsWith("va"));
        
        System.out.println(sl.endsWith("V"));// contain
        
        System.out.println(sl.contains("to"));
        System.out.println(sl.contains("To"));
}
}
