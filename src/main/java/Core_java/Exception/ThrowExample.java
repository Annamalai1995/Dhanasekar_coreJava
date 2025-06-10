package Core_java.Exception;

public class ThrowExample {
    void bloodElgigible(int age)
    {
        if(age>=18)
        {
            throw new ArithmeticException("You are not eligible");
        }
        else {
            System.out.println("eligible");
        }
    }

    public static void main(String[] args) {
        ThrowExample te= new ThrowExample();
        te.bloodElgigible(22);
    }
}
