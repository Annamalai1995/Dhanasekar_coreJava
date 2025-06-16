package Core_java.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_read {
    public static void main(String[] args) throws IOException {
        File fi= new File("F:\\Dhana.txt");
        FileInputStream fis= new FileInputStream(fi);
        int size=fis.available();
        System.out.println(size);
        byte [] get=new byte[fis.available()];
        fis.read(get);
        System.out.println(get);
        String ss= new String(get);
        System.out.println("Read The  text is:"+ss);





    }
}
