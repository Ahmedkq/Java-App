import java.util.Scanner;

public class TestPoint {

public static void main(String[] args) {
       // TODO Auto-generated method stub
       System.out.println("Program will calculate the distance between two points");
       Scanner keyboard = new Scanner(System.in);
      
       System.out.println("Enter x value for point 1");
       int x1 = keyboard.nextInt();
       System.out.println("Enter y value for point 1");
       int y1 = keyboard.nextInt();
       System.out.println("Enter x value for point 2");
       int x2 = keyboard.nextInt();
       System.out.println("Enter y value for point 2");
       int y2 = keyboard.nextInt();
      
      
       ThePoint p1 = new ThePoint(x1,y1);
       ThePoint p2 = new ThePoint(x2,y2);
      
       System.out.println("The points are (" +x1+ ", " + y1 +") and " + "(" +x2+ ", " + y2 +")" );
      
       double distance = p1.getdistance(p2);
       System.out.println("The distance between these points is ");
       System.out.println(distance);

   }

}
