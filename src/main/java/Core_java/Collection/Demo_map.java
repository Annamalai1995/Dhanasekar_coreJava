package Core_java.Collection;

import java.util.TreeMap;

public class Demo_map {
    public static void main(String[] args) {
        TreeMap<String,Mobile> ob=new TreeMap<String,Mobile>();
        Mobile mo= new Mobile("Vivo",256,850000.00);
        Mobile mo1=new Mobile("Iphone13",256,150000.22);
        Mobile mo2= new Mobile("Oppo",456,450000.20);
        Mobile mo3= new Mobile("Realme",256,654546.22);

        ob.put("Annamalai",mo1);
        ob.put("Dhanasekar",mo);
        ob.put("sathish",mo3);
        ob.put("prakash",mo2);
        System.out.println("TREEMAP VALUES"+ob);
    }
}
