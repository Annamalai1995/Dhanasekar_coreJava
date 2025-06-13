package Core_java.Collection;

import java.util.TreeMap;

public class Treemap1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm= new TreeMap<String,Integer>();
        tm.put("Annamalai",1);
        tm.put("Dhanasekar",2);
        tm.put("sathish",3);
        tm.put("Gowthami",4);
        System.out.println("Tree Map values:"+tm);
        System.out.println(tm.get("Gowthami"));
        System.out.println(tm.containsKey("sathish"));
        System.out.println(tm.containsValue(2));


    }
}
