import java.util.*;
public class Area_Of_Shapes{
  
  void Area(double length,double breadth){
    
    String area=String.format("%.3f",(length*breadth));
    System.out.println("Area of Rectangle is "+area+"sq.units.");
  }
  
  void Area(double radius){
    
    double pi = 3.1415;
    String area= String.format("%.3f", (pi*Math.pow(radius, 2)));
    System.out.println("Area of Circle is "+area+"sq.units.\n");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double radius,length,breadth;
    System.out.println("Enter radius of circle :");
    radius =sc.nextDouble();
    Area_Of_Shapes circle = new Area_Of_Shapes();
    circle.Area(radius);
    
    System.out.println("Enter length and breadth of rectangle :");
    length = sc.nextDouble();
    breadth=sc.nextDouble();
    Area_Of_Shapes rectangle = new Area_Of_Shapes();
    rectangle.Area(length, breadth);
    
  
  }
}