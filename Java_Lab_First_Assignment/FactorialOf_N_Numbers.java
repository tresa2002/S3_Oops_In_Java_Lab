// Java program to find the factorial of first n numbers.

import java.io.*;
import java.util.*;

public class FactorialOf_N_Numbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "n".
        int n = scan.nextInt();
        
        System.out.printf("Factorial of first %d numbers are:\n",n);
        for(int i=1; i<=n; i++){
            int fact = 1;
            for(int j=i; j>0; j--){
              fact*=j;
            }
            System.out.printf("\tFactorial of %d is: %d\n",i,fact);
        }
    }
}
     
        
        