package package1;

public class Student {
    private String name;

    // Create a constructor with arguments
    public Student(String name){
        this.name = name;
    }

    // Create a constructor without arguments
    public Student(){
        this("Irfan");
    }

    public void setName(String name){
        // this is correct if you want to use the same name this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

package package1;

public class TestStudent{
public static void main(String[] args){
Student student1= new Student();
Student student2=new Student();
System.out.println("The name of studnet1 is " + student1.getName());
System.out.println("The name of studnet2 is " + student2.getName());
}
}
