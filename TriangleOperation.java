// Program to calculate Area and Perimeter of a Triangle

import java.util.Scanner;

public class TriangleOperation {
    static double a, b, c;   // sides of the triangle
    static double area;
    static double perimeter;

    public static void main(String[] args) {
        readInput();       // Step 1: read sides of the triangle
        calculateValues(); // Step 2: calculate area and perimeter
        displayResult();   // Step 3: display the results
    }

    // Step 1: Take input from user
    static void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = sc.nextDouble();
        System.out.print("Enter side b: ");
        b = sc.nextDouble();
        System.out.print("Enter side c: ");
        c = sc.nextDouble();
        sc.close(); // Close the scanner to free resources
    }

    // Step 2: Calculate area (using Heron's formula) and perimeter
    static void calculateValues() {
        perimeter = a + b + c; // Perimeter = sum of sides
        double s = perimeter / 2; // Semi-perimeter
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    // Step 3: Display the results
    static void displayResult() {
        System.out.println("Perimeter of Triangle = " + perimeter);
        System.out.println("Area of Triangle = " + area);
    }
}
