// Program to calculate CSA, TSA, and Volume of a Cylinder

import java.util.Scanner;

public class CylinderOperation {
    static double radius, height;       // Input values
    static double csa, tsa, volume;     // Results

    public static void main(String[] args) {
        readInput();        // Step 1: Read radius and height
        calculateValues();  // Step 2: Calculate CSA, TSA, and Volume
        displayResult();    // Step 3: Display results
    }

    // Step 1: Take input from user
    static void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        height = sc.nextDouble();
        sc.close(); // Close scanner to free resources
    }

    // Step 2: Perform calculations
    static void calculateValues() {
        csa = 2 * Math.PI * radius * height;                    // Curved Surface Area
        tsa = 2 * Math.PI * radius * (radius + height);         // Total Surface Area
        volume = Math.PI * radius * radius * height;            // Volume
    }

    // Step 3: Display the results
    static void displayResult() {
        System.out.println("Curved Surface Area = " + csa);
        System.out.println("Total Surface Area = " + tsa);
        System.out.println("Volume of Cylinder = " + volume);
    }
}
