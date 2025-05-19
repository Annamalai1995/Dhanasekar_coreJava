package Core_java.Polymorphism.Overiding;

public class icicibank  extends Bank{
    public  int getrateofinterest()
    {
        return 9;
    }

    public static void main(String[] args) {
        icicibank ic= new icicibank();
        System.out.println(ic.getrateofinterest());
        Bank bb= new Bank();
        System.out.println(bb.getrateofinterest());
        Hdfcbank hd= new Hdfcbank();
        System.out.println(hd.getrateofinterest());
    }
}
