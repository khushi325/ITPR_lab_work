import java.util.*;  // Import Scanner class for taking user input

public class HCF {

    // Recursive function to find HCF using Euclidean algorithm
    static int hcf(int a, int b) {
        if (b == 0)                  // Base case: when b becomes 0, a is the HCF
            return a;
        return hcf(b, a % b);        // Recursive call: HCF(b, remainder of a divided by b)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        
        // Ask user to enter two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();  // Take first number

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();  // Take second number

        // Display both numbers
        System.out.println("\nYou entered: " + a + " and " + b);
        System.out.println("Calculating HCF...");

        // Call recursive function and store result
        int result = hcf(a, b);

        // Display the final result
        System.out.println("HCF of " + a + " and " + b + " is: " + result);

        sc.close();  // ✅ Close Scanner to prevent resource leak warning
    }
}
