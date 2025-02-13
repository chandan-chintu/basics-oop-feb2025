package inheritanceexample;

public class Dog extends Animal{

    @Override
    public void see() {
        System.out.println("Dog can see");
    }

    @Override
    public void breathe() {
        System.out.println("Dog can breathe");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
    }

    public  void bark(){
        System.out.println("Dog can bark");
    }
}
