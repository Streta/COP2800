public class retail
{
 public static void calculateRetail(double cost, double percent)
 {
   System.out.println("The retail price of your item is: " + ((cost * percent) + cost));
 }

 public static void main(String[] args)
 {
   calculateRetail(5.00,0.50);
 }
}
