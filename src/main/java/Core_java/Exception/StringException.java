package Core_java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        String data="Nothing More than happiness";
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("please enter the index value");
            System.out.println(data.charAt(scan.nextInt()));

        }catch (StringIndexOutOfBoundsException st)
        {
            System.out.println(st);
            System.out.println("index number should be less than "+data.length());
            System.out.println(data.charAt(scan.nextInt()));

        }
        catch (InputMismatchException ee)
        {
            System.out.println(ee);
        }
        finally {
            System.out.println("Nandri");
        }
    }
}
