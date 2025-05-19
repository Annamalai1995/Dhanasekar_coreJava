package Core_java.Operator;

public class Logical {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b||a>c);    //OR operator
        System.out.println(a<b&&a> c);
        System.out.println(!(a==b));
        System.out.println((a!=b));


        System.out.println("Welcom to India");


        String state="Tamilnadu";
        String state1="Tamilnadu";
        int height=177;
        int weight=80;
        System.out.println(state==state1 && height!=weight );
        System.out.println(state1=="salem"|| "Tamilnadu"==state1);
        System.out.println((!(weight>70)));
    }
}
