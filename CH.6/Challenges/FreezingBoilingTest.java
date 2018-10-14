import java.util.Scanner;

public class FreezingBoilingTest
{
  public static void main(String[] args)
  {
    int tempUser;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a temperature: ");
    tempUser = keyboard.nextInt();
    FreezingBoiling point = new FreezingBoiling(tempUser);
    System.out.println("\t\t Boiling Freezing");
    System.out.println("Ethyl Alchohol\t " + point.isEthylBoiling() + " " + point.isEthylFreezing());
    System.out.println("Oxygen:\t\t" + point.isOxygenBoiling()  + " " + point.isOxygenFreezing());
    System.out.println("Water:\t\t" + point.isWaterBoiling() + " " + point.isWaterFreezing()); 
  }
}
