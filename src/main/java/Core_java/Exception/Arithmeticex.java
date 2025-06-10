package Core_java.Exception;

public class Arithmeticex {
    public static void main(String[] args) {
        //try catch throw throws finally
        try
        {
            int alpha=1000;
            int beta=0;
            int output=alpha/beta;
            System.out.println(output);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
}
