package Core_java.Collection;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
class Mobile implements  Comparable<Mobile>
{
    String mobilename;
    Integer ram;
    Double price;

    @Override
    public String toString() {
        return "Mobile{" +
                "mobilename='" + mobilename + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilename, ram, price);
    }

    public  Mobile (String mobilename, Integer ram, Double price)
    {
        this.mobilename=mobilename;
        this.ram=ram;
        this.price=price;
    }



    @Override
    public int compareTo(Mobile o) {
        return o.price.compareTo(this.price) ;
    }
}

public class Demo_treeset {
    public static void main(String[] args) {
        TreeSet<Mobile> sathya=new TreeSet<Mobile>();
        sathya.add(new Mobile("Iphone",128,750000.00));
        sathya.add(new Mobile("Vivo",256,35000.00));
        sathya.add(new Mobile("Oppo",128,45000.65));
        sathya.add(new Mobile("Realme",256,20000.00));
        //System.out.println(sathya);
        Iterator i= sathya.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}
