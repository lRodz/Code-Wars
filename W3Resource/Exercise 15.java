//Write a Java program and compute the sum of an integer's digits.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
    
        int sum = 0;
        
        while (number > 0) {sum = sum + (number % 10); number = number / 10;}
        System.out.println("The sum of the digits is: "+sum);

    }
}

