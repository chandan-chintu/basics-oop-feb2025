package inheritanceexample;

public class Human extends Animal{

    @Override
    public void see() {
        System.out.println("Human can see");
    }

    @Override
    public void breathe() {
        System.out.println("Human can breathe");
    }

    @Override
    public void sleep() {
        System.out.println("Human can sleep");
    }

    public void think(){
        System.out.println("Human can think");
    }

    public void talk(){
        System.out.println("Human can talk");
    }
}
