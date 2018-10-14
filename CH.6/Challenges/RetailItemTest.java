public class RetailItemTest
{
  public static void main(String[] args)
  {
    RetailItem item1 = new RetailItem("Jacket",12,59.95);
    RetailItem item2 = new RetailItem("Designer Jeans",40,34.95);
    RetailItem item3 = new RetailItem("Shirt",20,24.95);

    System.out.println("Description\tUnits\tPrice");
    System.out.println(item1.getDesc() + "\t\t" + item1.getUnits() + "\t" + item1.getPrice());
    System.out.println(item2.getDesc() + "\t" + item2.getUnits() + "\t" + item2.getPrice());
    System.out.println(item1.getDesc() + "\t\t" + item3.getUnits() + "\t" + item3.getPrice());
  }
}
