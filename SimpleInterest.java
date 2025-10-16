// Step-by-step Simple Interest program 

import java.util.Scanner;

public class SimpleInterest {
    static double principal;
    static double rate;
    static double time;
    static double simpleInterest;

    public static void main(String[] args) {
        readInput();         // Step 1: read P, R, T
        calculateInterest(); // Step 2: compute SI
        displayResult();     // Step 3: show result
    }

    // Step 1: read input from user
    static void readInput() {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (per year): ");
        rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();
        sc.close(); // Close scanner to free resources
    }

    // Step 2: calculate simple interest using formula SI = (P * R * T) / 100
    static void calculateInterest() {
        simpleInterest = (principal * rate * time) / 100.0;
    }

    // Step 3: display the calculated interest
    static void displayResult() {
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
