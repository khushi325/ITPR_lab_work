import java.util.*;  // Import Scanner class for input

public class Factorial {

    // Recursive function to calculate factorial
    static int fact(int n) {
        if (n < 0) {                            // Handle negative numbers
            System.out.println("Factorial is not defined for negative numbers!");
            return -1;                          // Return -1 as an error value
        }
        if (n == 0)                             // Base case: 0! = 1
            return 1;
        return n * fact(n - 1);                 // Recursive call: n * (n-1)!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Create Scanner object
        System.out.print("Enter a number: ");

        // Check if user entered a number or just pressed Enter
        if (!sc.hasNextInt()) {                 // If input is not an integer
            System.out.println("Invalid input! Please enter a valid number.");
            sc.close();                         // Close scanner before exiting
            return;                             // Exit program
        }

        int n = sc.nextInt();                   // Read the integer input

        // Call the recursive function
        int result = fact(n);

        // Display result only if input was valid (non-negative)
        if (result != -1)
            System.out.println("Factorial = " + result);

        sc.close();  // ✅ Close Scanner to avoid resource leak warning
    }
}
