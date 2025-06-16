package Core_java.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Demo_read_secure {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\sekar.txt");
        FileInputStream fis= new FileInputStream(ff);
        InflaterInputStream iis= new InflaterInputStream(fis);
        int size= fis.available();
        byte bo[]=new byte[size];
        iis.read(bo);
        System.out.println(new String(bo));
        iis.close();
        fis.close();



    }
}
