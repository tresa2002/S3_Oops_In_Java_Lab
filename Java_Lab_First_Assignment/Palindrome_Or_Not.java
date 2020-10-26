// Java program to check whether the given number is palindrome or not.

import java.io.*;
import java.util.*;

public class Palindrome_Or_Not{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Enter the value for "num"
        int num = scan.nextInt();
        
        int res=0,temp;
        for(int i=num; i>0; i=(i/10)){
            temp = i%10;
            res = (res * 10) + temp;
        }
        if(res == num){
            System.out.println(num + " is palindrome");
        }
        else{
            System.out.println(num + " is not palindrome");
        }
    }
}
        
        