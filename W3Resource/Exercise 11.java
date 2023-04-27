//Write a Java program to convert a decimal number to a hexadecimal number.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the decimal number you wish to convert to hexadecimal: ");
         int x = scanner.nextInt();
         
         System.out.println("Hexadecimal number = "+Integer.toHexString(x)); 
      
    }
}
