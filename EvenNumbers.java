import java.util.*;  // Import Scanner class for user input

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        
        System.out.print("Enter how many even natural numbers to display: ");
        int n = sc.nextInt();  // Read user input
        
        System.out.println("First " + n + " even natural numbers are:");
        
        // Loop to print first n even natural numbers
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");  // Formula for even number = 2 × i
        }

        sc.close();  // Close Scanner to avoid resource leak warning
    }
}
