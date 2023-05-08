//Write a Java program to convert seconds to hours, minutes and seconds.
package com.mycompany.exercises;

import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input seconds:  ");
        int seconds = scanner.nextInt();
        
        int s = seconds % 60;
        int h = seconds / 3600;
        int m = h % 60;
        
        System.out.println(h + ":" + m + ":" + s);
        
        
        
        
 }
}
        
        
        
        
        
        



            
            
        
           


    

                        
                    
        


	

	

        
        
         
          
    

        
    
    


