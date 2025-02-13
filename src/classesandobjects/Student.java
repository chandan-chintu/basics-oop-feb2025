package classesandobjects;

public class Student {

    int id;
    String name;
    String email;
    String gender;
    String grade;
    String address;

    static int xyz=300; // static variable
    int mno=800; // non-static variable

    public void demo1(){
        System.out.println("demo1 non-static method");
    }

    public static void demo2(){
        System.out.println("demo2 static method");
    }

    // toString() - it converts the Object from memory into string format
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
