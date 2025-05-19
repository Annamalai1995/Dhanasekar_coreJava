package Core_java.Operator;

public class ShiftOperator {
    public static void main(String[] args) {
        //formula
        //Right shift=a/2(b)
        //LEft shift=a*2(b)

        int a=10;
        int b=5 ;
        int c;
        c=a<<b;// left
        System.out.println(c);
        c=a>>b; //Right
        System.out.println(c);
    }
}
