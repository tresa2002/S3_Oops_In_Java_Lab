// Java program to check whether a given number is prime or not

import java.io.*;
import java.util.*;

public class Prime_Or_Not{
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "num"
        int num = scan.nextInt();
        
        int prime = 1;
        if(num <= 1){
            prime = 0;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    prime = 0;
                }
            }
        }
        if(prime==1){
            System.out.println(num + " is prime\n");
        }
        else{
            System.out.println(num + " is not prime\n");
        }
    }
}