package Core_java.Polymorphism.Overiding;

public class DemoOverriding2 {
    public void district_name(String district1, String district2) {
        if(district1=="Salem")
        {
            System.out.println("Famous for Thattuvadai set");
        }
        else if(district2=="Tiruvarur"){
            System.out.println("Famous for Temples");
        }
        else {
            System.out.println("Not valid");
        }
    }
}

