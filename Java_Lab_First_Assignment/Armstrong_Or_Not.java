// Java program to check whether the given number is palindrome or not.

import java.io.*;
import java.util.*;

public class Armstrong_Or_Not{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "num"
        int num = scan.nextInt();
        
        int res=0, temp, sum=0;
        for(int i=num; i>0; i=(i/10)){
            temp = i%10;
            res = temp*temp*temp;
            sum += res;
        }
        if(num == sum){
            System.out.println(num + " is armstrong");
        }
        else{
            System.out.println(num + " is not armstrong");
        }
    }
}