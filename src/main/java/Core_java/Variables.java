package Core_java;

public class Variables {
    //local .global, and static
    static String  name="Dhanesekar";
    public int a=50;   //instance


    public void Dhana()   //Method
    {
        String college="Sona college";
        System.out.println("COLLEGE IS"+college);
        System.out.println("A  value is :"+a);
        System.out.println("Sttaic is:"+name);
    }

    public static void main(String[] args) {

        System.out.println("Annamalai");
        System.out.println("NAME IS:"+name);
        int value=1500;    //global
        int value1=4500;
        int res=value+value1;
        System.out.println(" RESULT:"+res);

        //CReating the object
        //classname objectname=new classname();
        Variables vv=new Variables();
        vv.Dhana();
    }
}
