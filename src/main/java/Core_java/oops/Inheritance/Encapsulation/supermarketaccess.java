package Core_java.oops.Inheritance.Encapsulation;

public class supermarketaccess  {

    public static void main(String[] args) {
        //supermarketaccess sa= new supermarketaccess();
        supermarket sa= new supermarket();
        sa.setProduct_id(1001);
        sa.setProduct_name("Fogg");
        sa.setProduct_category("Fragance");
        sa.setPrice(250);
        System.out.println(sa.getProduct_id()+"\n"+sa.getProduct_name()+"\n"+sa.getProduct_category()+"\n"+sa.getPrice());



    }
}
