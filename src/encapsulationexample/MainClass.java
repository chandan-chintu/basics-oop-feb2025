package encapsulationexample;

public class MainClass {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(101);
        student1.setName("Vijay");
        student1.setEmail("vijay123@gmail.com");
        student1.setGrade("8th grade b section");
        student1.setGender("male");
        student1.setAddress("123,jsiw,io,alppwp");

        System.out.println("student1 is : "+student1);

        System.out.println("student1 email is : "+student1.getEmail());
        System.out.println("student1 address is : "+student1.getAddress());
    }
}
