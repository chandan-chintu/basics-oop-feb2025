package polymorphismexample;

public class SampleClass {

    public void sum(int a, int b){
        System.out.println("sum of two int numbers : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three int numbers : "+(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float numbers : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double numbers : "+(a+b));
    }

    public void sum(int a, double b){
        System.out.println("sum of two int and double numbers : "+(a+b));
    }
}
