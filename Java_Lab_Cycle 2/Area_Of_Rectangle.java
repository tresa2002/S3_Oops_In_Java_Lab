import java.util.Scanner;

public class Area_Of_Rectangle{
  
  String area= "";

  Area_Of_Rectangle(double length,double breadth){  
    area=String.format("%.3f", (length*breadth));
  }
  String returnArea() {
    return this.area;
  }
  
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length and beadth of rectangle: ");
    double length = sc.nextDouble();
    double breadth=sc.nextDouble();
    Area_Of_Rectangle ob = new Area_Of_Rectangle(length,breadth);
    String area = "";
    area=ob.returnArea();
    
    System.out.println("Area of Rectangle = "+area+" sq.units");
    
    
  }

  
}