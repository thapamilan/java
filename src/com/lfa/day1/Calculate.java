package com.lfa.day1;

import java.util.*;

public class Calculate{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
System.out.println("Enter Length");
        int Length = input.nextInt();

        System.out.println("Enter Breadth");
        int Breadth = input.nextInt();

        System.out.println("Enter Height");
        int Height = input.nextInt();

int area = Length*Breadth;
System.out.printf("the area is %d\n",area);
System.out.println();
    
    int volume = Length*Breadth*Height;

    //System.out.println (+volume);
    System.out.printf("The volume is %d\n", volume);


int cube = Length*Length*Length;
int square = Length*Length;
int perimeter = 2*(Length+Breadth);

System.out.printf("The cube value is %d\n",cube );
System.out.printf("The cube value is %d\n",square );
System.out.printf("The cube value is %d\n",perimeter);




    }
}
