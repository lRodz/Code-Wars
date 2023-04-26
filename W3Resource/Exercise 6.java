//Write a Java program to print the area and perimeter of a circle.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("What is the radius of the circle?");
         double radius = scanner.nextDouble();
         
         double area = radius*Math.PI;
         double perimeter = 2*Math.PI*radius;
         
         System.out.println("Area is = "+area);
         System.out.println("Perimeter is = "+perimeter);
         
    }
}
