package polymorphismexample;

public class MainClass {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();
        sampleClass.sum(12,34);
        sampleClass.sum(23,21,9);
        sampleClass.sum(34.78,78.09);
        sampleClass.sum(21.45f,12.33f);
        sampleClass.sum(12,23.44);
    }
}
