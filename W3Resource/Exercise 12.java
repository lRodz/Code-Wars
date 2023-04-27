//Write a Java program to convert a binary number to a decimal number.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enther the binary number you wish to convert to decimal: ");
         String x = scanner.next();
         
         System.out.println("Decimal number = "+ Integer.parseInt(x, 2));
      
    }
}
