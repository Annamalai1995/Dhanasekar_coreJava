package Core_java.Array;

import java.util.Arrays;

public class create {
    public static void main(String[] args) {
        String College_name[]={"PSG","KCT","KCE","Sona","Saranathan","Mahalingaam"};
         System.out.println("College Name:"+College_name);
        // System.out.println(Arrays.toString(College_name));
//        System.out.println("Length Of Array"+College_name.length);
//        System.out.println(College_name[5]);

        //For LOOP
        for(int start=0;start<College_name.length;start++)
        {
            System.out.println(College_name[start]);
        }
        //Array FOr Each
        //Syntax:
//        for(variablename:Arrayname)
//        {
//
//        }
//        for(String clgname:College_name)
//        {
//            System.out.println(clgname);
//
        //        }

    }
}
