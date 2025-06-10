package Core_java.Exception;

import java.util.Scanner;

public class Demo_chance {
    static  Scanner scan = new Scanner(System.in);
    public static void unlimt(String content)
    {
        try
        {
            System.out.println("enter the starting value");
            int start=scan.nextInt();
            System.out.println("enter the ending value");
            int end=scan.nextInt();
            System.out.println("MY values"+content.substring(start,end));
        }catch (StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting the value is o ending value "+content.length()+"\n please enter only in this between number");
            unlimt(content);
        }

    }
    public static  void limit(String content,int chance)
    {
        try
        {
            System.out.println("Enter the starting string");
            int start = scan.nextInt();
            System.out.println("Enter the ending string");
            int end=scan.nextInt();
            System.out.println("MY values"+content.substring(start,end));

        }catch (StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting the value is o ending value "+content.length()+"\n please enter only in this between number");
            if(chance < 3)
            {
                chance++;
                limit(content,chance);
            }
            else {
                System.out.println("chance is over");
            }



        }
    }
    public static void main(String[] args) {
        String mydata="Nothing more than Happiness,Knowledge is power,Health is wealth";
        //unlimt(mydata);
        limit(mydata,1);

    }
}
