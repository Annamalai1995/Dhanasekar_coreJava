package Core_java.controlStmts;

import java.util.Scanner;

public class Demo_Stmts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("My company details");
        String emp_company_name=scan.nextLine();
        if(emp_company_name.equalsIgnoreCase("Zealous"))
        {
            System.out.println("You are working IT field");
        } else if (emp_company_name.equalsIgnoreCase("Cts")) {
            System.out.println("your working BPO");
        }
        else {
            System.out.println("Your not working in both category");
        }


    }
}
