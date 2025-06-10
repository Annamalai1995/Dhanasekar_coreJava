package Core_java.Exception;

public class throwexception {
    public void accessing()
    {
        try
        {
            throw new NullPointerException();

        }catch (NullPointerException ne)
        {
            System.out.println("Try block executed");
            throw ne;
        }
    }
    public static void main(String[] args) {
     throwexception te= new throwexception();
     try
     {
         te.accessing();
     }catch (NullPointerException npee)
     {
         System.out.println("Main method excecuted");
     }finally {
         System.out.println("Nandri");
     }
    }
}
