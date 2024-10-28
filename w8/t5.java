public class t5 {
    public static void main(String[] args) {
    double[]mylist =new double[5];
    for (int i= 0;i <mylist.length; i++){
    mylist[i]=Math.random()*10;
    }
    for(int i=1;1<mylist.length; i++){
    double total= 0;
    System.out.print(mylist[i] +"");
    total+=mylist[i];
    System.out.println();
    System.out.print("Sum of all elements is: "+total);
}
    }
}
