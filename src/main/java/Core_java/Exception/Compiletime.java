package Core_java.Exception;

import java.io.IOException;

public class Compiletime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run=Runtime.getRuntime();
        Process pro;
        pro=run.exec("notepad");
        Thread.sleep(5000);
        pro=run.exec("mspaint");
    }
}
