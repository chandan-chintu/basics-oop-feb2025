package inheritanceexample;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("-----------Animal parent class-------------");
        Animal animal = new Animal();
        animal.breathe();
        animal.see();
        animal.sleep();

        System.out.println("-----------Dog child class-------------");
        Dog dog = new Dog();
        dog.breathe();
        dog.see();
        dog.sleep();
        dog.bark();

        System.out.println("-----------Human child class-------------");
        Human human = new Human();
        human.breathe();
        human.see();
        human.sleep();
        human.think();
        human.talk();

        System.out.println("-----------Bird child class-------------");
        Bird bird = new Bird();
        bird.breathe();
        bird.see();
        bird.sleep();
        bird.fly();
    }
}
