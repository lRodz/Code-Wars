//Write a Java program to compute hexagon area.

package com.mycompany.exercises;
import java.util.Scanner;

public class Exercises {
    
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter the length of a side of the hexagon: ");
        double x = scanner.nextDouble();
        
        double area = (6*(x*x)) / (4*Math.tan(Math.PI/6));
        System.out.println("Area = "+area);
    
    }
}

