package com.lfa.day1;
import java.util.Scanner;

public class SimpleInterest{

    public static void main(String[] args){

        Scanner d = new Scanner(System.in);
        
        System.out.println("Enter principle");
       int p = d.nextInt();

        System.out.println("Enter rate");
       int r = d.nextInt();

        System.out.println("Enter time");
        int t = d.nextInt();

        int interest = (p*t*r)/100;
        System.out.println("Interest is" + interest);

        



    }
}