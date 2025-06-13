package Core_java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> td=new TreeSet<String>();
        td.add("Dhanasekar");
        td.add("Salem");
        td.add("785252123");
        td.add("sona");
        td.add("MCA");
        System.out.println("Treeset Values:"+td);
        HashSet<String> hs= new HashSet<String>();
        hs.addAll(td);
        Iterator<String> i =hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+"Hash set values");
        }
    }
}
