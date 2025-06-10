package Core_java.Constructor;

public class DemoDefConstructor {
    public void hello()
    {
        System.out.println("Hello There.....");
    }
    public DemoDefConstructor()
    {
        System.out.println("This is Default Constructor");
    }
    public static void main(String[] args) {
        //classname objectname= new constructorname();
        DemoDefConstructor dc= new DemoDefConstructor();

    }

}
