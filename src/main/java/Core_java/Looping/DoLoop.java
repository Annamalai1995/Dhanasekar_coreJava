package Core_java.Looping;

import java.util.Scanner;

public class DoLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int staff = 0;
        float time=0;
        int count=0;

        do {
            System.out.println(staff+" staff-enter login time");
            time =scan.nextFloat();
            if(time>9.15)
            {
                System.out.println(time+"your late comer so,your salary 10 % is deducted");
                count++;
            }
            else {
                System.out.println("your good time come to school");
            }
            staff++;

        }
        while(staff>0);
        System.out.println("this month later commer count is "+count);

    }
}
