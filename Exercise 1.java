package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

        //Write a Java program to print 'Hello' on screen and your name on a separate line
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is your name?");
         String name = scanner.nextLine();
         
         System.out.println("Hello");
         System.out.println(name);
         
         
    }
}
