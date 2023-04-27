//Write a Java program to compare two numbers.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the first number?");
        int x = scanner.nextInt();
        
        System.out.println("What is the second number?");
        int y = scanner.nextInt();
        
       if ( x == y )           
            System.out.println(x +" = "+y);
       if ( x != y )           
            System.out.println(x +" != "+y);
       if ( x > y )           
            System.out.println(x +" > "+y);
       if ( x < y )           
            System.out.println(x +" < "+y);
       if ( x >= y )           
            System.out.println(x +" >= "+y);
       if ( x <= y )           
            System.out.println(x +" <= "+y);

    }
}
