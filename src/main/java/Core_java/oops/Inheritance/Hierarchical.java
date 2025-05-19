package Core_java.oops.Inheritance;
class Reliance
{
    public void Departments()
    {
        System.out.println("Bakery things");
        System.out.println("House old things");
        System.out.println("Medical things");
    }

}
class  Bakery extends  Reliance
{
    public void sweets()
    {
        String fav_sweet="Rasagulla";
        String fav_sweet1="Gulabjammun";
        System.out.println("My fav sweet:"+fav_sweet);
        System.out.println("My fav sweet is"+fav_sweet1);
    }
}
class houseoldthings extends  Reliance
{
    public  void Decoration()
    {
        String lamp="LED";
        String flowers="Boquet";
        System.out.println("Lamp :"+lamp);
        System.out.println("Flowers :"+flowers);
    }
}
public class Hierarchical {
    public static void main(String[] args) {

        houseoldthings ho = new houseoldthings();
        ho.Decoration();
        ho.Departments();
        Bakery bb= new Bakery();
        bb.sweets();
    }
}
