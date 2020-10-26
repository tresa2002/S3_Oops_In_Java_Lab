// Java program to find the factor of a given number.

import java.io.*;
import java.util.*;

public class Factor_Of_Number{
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "num"
        int num = scan.nextInt();
        
        System.out.printf("The Factors of %d are:\n",num);
        for(int i=1 ; i<=num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
        