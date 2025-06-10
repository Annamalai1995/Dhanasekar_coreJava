package Core_java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the value");
            int a=scan.nextInt();
            System.out.println("please enter the value");
            int b=scan.nextInt();
            System.out.println(a/b);

        }catch (ArithmeticException ae)
        {
            System.out.println("please enter the b  value is not zero");
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter the value");
            int a= scan.nextInt();
            System.out.println("please enter the value");
            int b= scan.nextInt();
            System.out.println(a/b);
        }catch (InputMismatchException ie)
        {
            System.out.println(ie);
            try
            {
                System.out.println("please enter the value only numeric number");
                System.out.println("please enter b value is not zero");
                Scanner scan = new Scanner(System.in);
                System.out.println("please enter the value");
                int a= scan.nextInt();
                System.out.println("please enter the value");
                int b= scan.nextInt();
                System.out.println(a/b);
            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }

        }finally {
            System.out.println("Nandri");
        }

    }
}
