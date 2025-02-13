package inheritanceexample;

public class Bird extends Animal{

    public int abc=400;

    @Override
    public void see() {
        System.out.println("parent abc is : "+super.abc);
        System.out.println("Bird can see");
    }

    @Override
    public void breathe() {
        System.out.println("child abc is : "+abc);
        System.out.println("Bird can breathe");
    }

    @Override
    public void sleep() {
        System.out.println("Bird can sleep");
    }

    public void fly(){
        System.out.println("Bird can fly");
    }
}
