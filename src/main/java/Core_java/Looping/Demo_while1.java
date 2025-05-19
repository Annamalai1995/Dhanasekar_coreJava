package Core_java.Looping;

public class Demo_while1 {
    public static void main(String[] args) {
        int number=1234,reverse=0;
        while (number!=0)
        {
            int digitscount=number%10;//9789%10
            reverse=reverse*10+digitscount;
           number=number/10;

        }
        System.out.println(number+"Your  number reversed"+reverse);

    }
}
