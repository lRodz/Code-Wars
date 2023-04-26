//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the first number?");
         double a = scanner.nextDouble();
         
         System.out.println("What is the second number?");
         double b = scanner.nextDouble();
         
         double sum = a + b;
         double mult = a * b;
         double sub = a - b;
         double div = a / b;
         double remain = a % b;
         
         
         System.out.println(a+" + "+b+" = "+sum);
         System.out.println(a+" * "+b+" = "+mult);
         System.out.println(a+" - "+b+" = "+sub);
         System.out.println(a+" / "+b+" = "+div);
         System.out.println(a+" mod "+b+" = "+remain);
         
    }
}
