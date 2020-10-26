// Java program to print Fibonacci Series

import java.io.*;
import java.util.*;

public class Fibonacci_Series{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
  
        //Enter the vue for "num"
        int num = scan.nextInt();
        
        System.out.printf("Fibonacci series upto %d numbers are:\n",num);
        
        int first = 0, second = 1, third;
        for(int i=1 ; i<=num ; i++){
          System.out.print(first + " ");
          third = first + second;
          first = second;
          second = third;
        }
    }
}
  
