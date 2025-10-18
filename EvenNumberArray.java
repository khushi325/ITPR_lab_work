import java.util.Scanner;

// Class to handle array operations
class EvenArray {
    int[] numbers = new int[20]; // Array to store 20 numbers

    // Method to input numbers from the user
    void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close(); // Close Scanner to free system resources
    }

    // Method to display even numbers from the array
    void displayEven() {
        System.out.println("\nEven numbers are:");
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

// Main class
public class EvenNumberArray {
    public static void main(String[] args) {
        // Create object of EvenArray class
        EvenArray obj = new EvenArray();

        // Call methods to input and display even numbers
        obj.inputNumbers();
        obj.displayEven();
    }
}
