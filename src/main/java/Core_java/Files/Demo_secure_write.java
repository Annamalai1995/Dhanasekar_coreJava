package Core_java.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Demo_secure_write {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\sekar.txt");
       // ff.createNewFile();
        FileOutputStream fos= new FileOutputStream(ff);
        DeflaterOutputStream dos= new DeflaterOutputStream(fos);
        Scanner scan= new Scanner(System.in);
        String obj= scan.nextLine();
        dos.write(obj.getBytes());
        System.out.println(ff.getName()+"Has write successfully");
        dos.close();
        fos.close();


    }
}
