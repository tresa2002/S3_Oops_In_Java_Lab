// Java program to add two numbers

import java.io.*;
import java.util.*;

class Add_Two_Numbers{
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter values for "num1" and "num2"
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.printf("Sum of two numbers : %d",(num1 + num2));
  }
}