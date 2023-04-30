//Write a Java program to count letters, spaces, numbers and other characters in an input string.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
          System.out.println("Enter a string: ");
          String input = scanner.nextLine();
          scanner.close();
          
          int letterCount = 0;
          int spaceCount = 0;
          int numberCount = 0;
          int otherCount = 0;
          
          for (int i = 0; i < input.length(); i++) {char c = input.charAt(i);
          if (Character.isLetter(c) ) {letterCount++;}
          else if (Character.isSpaceChar(c)) {spaceCount++;}
          else if (Character.isDigit(c)) {numberCount++;}
          else  {otherCount++;} }
          
          System.out.println("Letters: "+letterCount);
          System.out.println("Spaces: "+spaceCount);
          System.out.println("Numbers: "+numberCount);
          System.out.println("Others: "+otherCount);
         }
          
    }

        
    
    


