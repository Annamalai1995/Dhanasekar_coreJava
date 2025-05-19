package Core_java.casting;

public class Demo_casting {
    public static void main(String[] args) {

        //Changing the one datatype to another datatype
        char sweet='R';
        int delicious=sweet;
        System.out.println("Sweet is :"+delicious);
        //Narrowing large to small
        double weight=50.5;
        int myweight=(int)weight;
        System.out.println("My weight:"+myweight);
        long mblno=9688193688l;
        int covertlong=(int) mblno;
        System.out.println("MOBILE  NUMBER:"+covertlong);
        int number=11; 
        char value=(char)number;
        System.out.println("Char value is :"+value);


    }
}
