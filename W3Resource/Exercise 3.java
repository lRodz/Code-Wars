//Write a Java program to divide two numbers and print them on the screen.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the first number?");
         double a = scanner.nextDouble();
         
         System.out.println("What is the second number?");
         double b = scanner.nextDouble();
         
         double c = a / b;
         
         System.out.println(a+" divided by "+b+" is: "+c);
         
         
    }
}
