package Core_java.oops.Inheritance.Multiple;

public class MutlipleInheritance implements mall,mall1,mall2 {
    public void Marinamall()
    {
        System.out.println("Marina mall is largest");
    }

    @Override
    public void Reliance() {
        System.out.println("Reliance grocery available ");
    }

    @Override
    public void lulumall() {
        System.out.println("LULU Mall is the biggest mall  in the world");
    }

    @Override
    public void Phoenixmarketcity() {
        System.out.println("Phonenix mall is the  largest in Chennai");

    }

    public static void main(String[] args) {
        MutlipleInheritance mi=new MutlipleInheritance();
        mi.lulumall();
        mi.Marinamall();
        mi.Phoenixmarketcity();
        mi.Reliance();
    }
}
