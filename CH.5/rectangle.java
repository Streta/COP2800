import java.util.Scanner;

public class rectangle
{
  public static void main(String[] args)
  {
    double length, 
	   width, 
	   area;

    length = getLength();
    width  = getWidth();
    area   = getArea(length, width);
    displayData(length, width, area);
  }
  
  public static double getLength()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("What is the rectangles length: ");
    double lengthGiven = keyboard.nextDouble();
    return lengthGiven;
  }
  
  public static double getWidth()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("What is the rectangles width: ");
    double widthGiven = keyboard.nextDouble();
    return widthGiven;
  }

  public static double getArea(double length, double width)
  {
    return (length * width);
  }

  public static void displayData(double length, double width, double area)
  {
    System.out.println("Length: " + length);
    System.out.println("Width: "  + width);
    System.out.println("Area: "   + area);
  }
}
