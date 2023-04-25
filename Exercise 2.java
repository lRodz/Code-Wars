//Write a Java program to print the sum of two numbers.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the first number?");
         int a = scanner.nextInt();
         
         System.out.println("What is the second number?");
         int b = scanner.nextInt();
         
         int c = a + b;
         
         System.out.println("The sum of "+a+" + "+b+" is: "+c);
         
         
    }
}
