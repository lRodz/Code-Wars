//Write a Java program to reverse a string.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter the string: ");
        String string = scanner.next();
        
        string = new StringBuilder(string).reverse().toString();
        
        System.out.println(string);
    
    }
}

