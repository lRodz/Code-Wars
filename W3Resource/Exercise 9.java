//Write a Java program to add two binary numbers.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter first binary number: ");
         String x = scanner.next();
         
         System.out.println("Enter second binary number: ");
         String y = scanner.next();
         
         int n1 = Integer.parseInt(x, 2);
         int n2 = Integer.parseInt(y, 2);
         int n3 = n1 + n2;
         
         System.out.println("n1 = "+Integer.toBinaryString(n1));
         System.out.println("n2 = "+Integer.toBinaryString(n2));
         System.out.println("n1 + n2 = "+Integer.toBinaryString(n3));
         
         
         
      
    }
}
