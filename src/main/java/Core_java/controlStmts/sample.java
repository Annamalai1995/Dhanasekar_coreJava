package Core_java.controlStmts;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("enter the age");
        int age=ss.nextInt();
        if(age>=18)
        {
            System.out.println("welcome to wonderla");
            System.out.println("Thirlling  water games");
            String gender=ss.next();
            //if(gender.equalsIgnoreCase("Male"))
            if(gender.equals("Male")||(gender.equals("male")))
            {
                System.out.println("your  water level zone 40M");
            }
            else {
                System.out.println("Your water level is high ");
            }

        }
        else {
            System.out.println("its a kids area not allowed");
        }
    }
}
