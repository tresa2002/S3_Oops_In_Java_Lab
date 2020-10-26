// Java program to find the sum of first n Natural Numbers

import java.io.*;
import java.util.*;

class SumOf_N_NaturalNumbers{
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "n".
        int n = scan.nextInt();
        
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.printf("Sum of first %d natural numbers : %d",n,sum);
    }
}