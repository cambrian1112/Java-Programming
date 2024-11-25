public class C1 {
    public int x = 1;
    int y =2;
    private int z=3;
    public void m1(){
    System.out.println("I am method 1");}
    void m2(){
    System.out.println("I am method 2");}
    private void m3(){
    System.out.println("I am method 3");}}
 public class C2{
    public static void main(String[] args){
    C1 c1 = new C1();
    System.out.println(c1.x);
    System.out.println(c1.y);
    //System.out.println(c1.z);
     c1.m1(); 
     c1.m2(); 
    // c1.m3(); 
    }}
