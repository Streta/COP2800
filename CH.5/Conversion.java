import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;

public class Conversion
{
  public static void main(String[] args)
  {
    int choice;
    double length;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter meters: ");
    length = keyboard.nextDouble();
    
    while (length <= 0)
    {
      System.out.printf("Please enter a number greater than 0: ");
      length = keyboard.nextInt();
    }
    
    ShowMenu(); 
    choice = keyboard.nextInt();
    
    switch (choice)
    {
      case 1: ConvertToKilo(length);
	      break;
      case 2: ConvertToInches(length);
	      break;
      case 3: ConvertToFeet(length);
	      break;
      case 4: QuitProgram();
    }
  }
  
  public static void ConvertToKilo(double meters)
  {
    double Kilometers = (meters * 0.001);
    System.out.printf("%.2f",Kilometers);
  }
  
  public static void ConvertToInches(double meters)
  {
    double Inches = (meters * 39.97);
    System.out.printf("%.2f",Inches);
  }
  
  public static void ConvertToFeet(double meters)
  {
    double Feet = (meters * 3.281);
    System.out.printf("%.2f",Feet);
  }
  
  public static void ShowMenu()
  {
    System.out.printf("1. Convert to Km\n2. Convert to in\n3. Convert to feet\n4. Quit");
  }

  public static void QuitProgram()
  {
    System.out.printf("C y@");
    System.exit(0);
  } 
}
