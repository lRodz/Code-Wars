//Write a Java program that takes a number as input and prints its multiplication table up to 10.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the number?");
         double number = scanner.nextDouble();
         
         for ( int i = 0; i <= 10; i++ ) {System.out.println(number+" x "+ i+" = "+(number*i));}
         
    }
}
