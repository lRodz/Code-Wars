//Write a Java program to convert a binary number to a hexadecimal number.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the binary number you wish to convert to hexadecimal: ");
         int x = Integer.parseInt(scanner.next(), 2);
         
         System.out.println("Hexa = "+Integer.toHexString(x));
         
    }
}
