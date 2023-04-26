//Write a Java program to swap two variables.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the first variable?");
         String first = scanner.nextLine();
         
         System.out.println("What is the second variable?");
         String second = scanner.nextLine();
         
         String temp = first;
         
          first = second;
          second = temp;
          
          System.out.println("Your fist variable is now: "+first);
          System.out.println("Your second variable is now: "+second);
      
    }
}
