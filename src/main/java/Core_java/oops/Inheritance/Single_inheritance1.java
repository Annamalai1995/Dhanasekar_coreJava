package Core_java.oops.Inheritance;

public class Single_inheritance1 extends Single_inheritance{
    public void sub()
    {
        int a=200;
        int b=15;
        int c=a-b;

        System.out.println("Sub:"+c);
    }

    public static void main(String[] args) {
        Single_inheritance1 si= new Single_inheritance1();
        si.Add();
        si.sub();
    }
}
