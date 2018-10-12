import java.util.Scanner;
import java.util.*;

public class distance
{
  public static void main(String[] args)
  {
    double speed,
	   time,
	   total;
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Please enter speed and time: ");
    speed = keyboard.nextDouble();
    time  = keyboard.nextDouble();
    
    total = distance(speed,time);
    System.out.println("Your distance is: " + total);
  }

  public static double distance (double speed, double time)
  {
    double distance = (speed * time);
    return distance;
  }
}

