package Core_java.controlStmts;

import java.util.Scanner;

public class Demo_Nestedif {
    static void nestedif(int cibilscore,double salary)
    {
        if(cibilscore>=750)
        {
            System.out.println("Your card Approved");
            if((salary >=2.2) && (salary<=3.2)){
                System.out.println("Your card limit 50K Approved");
            } else if ((salary >=3.3)&& (salary<=5.5)) {
                System.out.println("Your card limit ONE LAKH Approved");
                Scanner scan= new Scanner(System.in);
                System.out.println("Enter Aadhar card number");
                long adharno=scan.nextLong();
                if(adharno==123456789)
                {
                    System.out.println("welcome to credit card service");
                }else {
                    System.out.println("Not valid");
                }
            }else if(salary > 5)
            {
                System.out.println("your credit card limit TWO LAKH Only");
            }
            else
            {
                System.out.println("Salary low.......");
            }
        }else {
            System.out.println("Not approved card");
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HDFC CREDIT CARD");
        System.out.println("Please enter your cibil score");
        int cibilscore=scan.nextInt();
        System.out.println("Please enter your salary Lakh Per Annum");
        double anualsalary=scan.nextDouble();

        Demo_Nestedif.nestedif(cibilscore,anualsalary);
    }
}
