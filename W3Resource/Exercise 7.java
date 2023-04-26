//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the first number?");
         double a = scanner.nextDouble();
         
         System.out.println("What is the second number?");
         double b = scanner.nextDouble();
         
         System.out.println("What is the third number?");
         double c = scanner.nextDouble();
         
         System.out.println("The average is: " + (a + b + c ) / 3);
         
         
         
    }
}
