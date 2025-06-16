package Core_java.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        //SYntax:
        //File filename= new File("Relative path");
        File fi= new File("F:\\Dhana.txt");
//        fi.createNewFile();
//        System.out.println(fi.getName()+"Has successfully  create the file");

        FileOutputStream fo= new FileOutputStream(fi);
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the new text file");
        String inputfile=scan.nextLine();
        fo.write(inputfile.getBytes());
        System.out.println(fi.getName()+"Write file successfully");




    }

}
