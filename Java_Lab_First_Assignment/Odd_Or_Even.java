// Java program to check whether a given number is odd or even.

import java.io.*;
import java.util.*;

public class Odd_Or_Even{
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "num"
        int num = scan.nextInt();
        
        if(num % 2 == 0){
            System.out.printf(num + " is even\n");
        }
        else{
            System.out.println(num + " is odd\n");
        }
    }
}