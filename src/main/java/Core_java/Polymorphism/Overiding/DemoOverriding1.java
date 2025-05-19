package Core_java.Polymorphism.Overiding;

public class DemoOverriding1 {
    public void district_name(String district1,String district2)
    {
        if((district1==district2)||(district1!=district2))
        {
            System.out.println("My district is very famous for Food");
        }
        else {
            System.out.println("Waste of city");
        }
    }
}
