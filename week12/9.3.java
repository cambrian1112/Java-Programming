package package1;

public class class1 {
    public int x = 5;
    int y = 10;

    void m1() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("This is main method of class1");
    }
}

package package1;

public class class2 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        System.out.println(c1.x);
        System.out.println(c1.y);
    }
}
