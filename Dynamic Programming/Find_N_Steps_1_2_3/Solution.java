import java.io.*;
import java.util.*;
/*
This is the program of counting the how many ways we can count the no of steps (1,2,3) for a given no of n steps.
It uses the concept of dynamic programming.
Author: Patrick Prakash
 */

class Solution {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;
        int n = 0;
        int d =0;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    if(n==1 || n==2)
    {
        System.out.println("The No of steps:-"+n);
    }
    else if(n ==3)
    {
        System.out.println("The No of steps:-"+c);
    }
    else{
        for(int i = 0; i<n-4; i++)
        {
            d = a+b+c;
            a=b;
            b=c;
            c=d;
        }
        System.out.println("The No of steps:-"+d);
        }
    }
}