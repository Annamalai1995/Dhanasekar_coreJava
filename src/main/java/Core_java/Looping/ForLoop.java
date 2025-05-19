package Core_java.Looping;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        for(int myrequirementplace=10;myrequirementplace>0;)
        {
            System.out.println("what is your Experience");
            float experience=scan.nextFloat();
            if(experience >=4 && experience<=8)
            {
                System.out.println("your Selected in this process no :"+myrequirementplace);
                myrequirementplace--;
            }
            else {
                System.out.println("your not selected in this company");
            }
        }
    }
}
