package interfaceexample;

public interface SampleInterface {

    public int abc=300; // even though final keyword is not added abc is by default final variable
    public final int xyz =500;

    public void demo1(); // it adds abstract by default
    public abstract void demo2();

}
