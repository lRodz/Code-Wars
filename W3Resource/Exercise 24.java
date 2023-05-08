//Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. 
//The integers are non-negative
package com.mycompany.exercises;

import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input first integer: ");
        int a = scanner.nextInt();
        
        System.out.println("Input second integer: ");
        int b = scanner.nextInt();
        
        System.out.println("Input third integer: ");
        int c = scanner.nextInt();
        
        if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {System.out.println("true");}
        
 }
}
        
        
        
        
        
        



            
            
        
           


    

                        
                    
        


	

	

        
        
         
          
    

        
    
    


