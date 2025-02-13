package classesandobjects;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("before assigning values : "+student1);


        // assigning the values to student object
        student1.id =101;
        student1.name="Sanjay";
        student1.address="123,jwiw,uiaowow,misoos";
        student1.email="sanjay123@gmail.com";
        student1.gender="male";
        student1.grade="9th grade B section";

        System.out.println("after assigning values : "+student1);

        int abc = 100;
        System.out.println("abc is : "+abc);
        abc=200;
        System.out.println("abc after changing : "+abc);

        final int pqr = 300;
        System.out.println("pqr is : "+pqr);
        // pqr=400; - cannot update

        System.out.println("mno value is : "+student1.mno);// since it is non-static object is required
        System.out.println("xyz value is : "+Student.xyz); // since it is static object is not required

        student1.demo1();
        Student.demo2();
    }
}
