package Core_java.Polymorphism.Overiding;



public class Bankaccess {
    public static void main(String[] args) {
        //Upcasting
        Bank bb= new icicibank();
        System.out.println(bb.getrateofinterest());
        Bank bb1= new Hdfcbank();
        System.out.println(bb1.getrateofinterest());
        Bank bb2= new Bank();
        System.out.println(bb2.getrateofinterest());

    }
}
