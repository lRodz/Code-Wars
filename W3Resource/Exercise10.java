//Write a Java program to convert an integer number to a binary number.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the number you wish to convert to binary: ");
         int x = scanner.nextInt();
         
         System.out.println("Binary number = "+Integer.toBinaryString(x)); 
      
    }
}
