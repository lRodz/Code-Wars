//Write a Java program to find the number of values in a given range divisible by a given value.
package com.mycompany.exercises;

import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a range of integers from:  ");
        int x = scanner.nextInt();
        
        System.out.println("To: ");
        int y = scanner.nextInt();
        
        System.out.println("That are divisible by: ");
        int d = scanner.nextInt();
        
        int amount = 0;
        
        for (int i = x; i <= y; i++) {if (i % d == 0) {System.out.println(i); amount++;}}
        
        System.out.println("The number of integers within the range "+ x +" to "+ y + " that are divisible by "+ d + " is: "+amount);
        
 }
}
        
        
        
        
        
        



            
            
        
           


    

                        
                    
        


	

	

        
        
         
          
    

        
    
    


