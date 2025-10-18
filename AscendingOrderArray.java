import java.util.Scanner;

// Class to handle array input and sorting
class AscendingArray {
    int[] numbers = new int[10];

    // Method to input 10 numbers
    void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close(); // Closing the Scanner
    }

    // Method to arrange numbers in ascending order
    void sortAscending() {
        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    // Method to display sorted numbers
    void displaySorted() {
        System.out.println("\nNumbers in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

// Main class
public class AscendingOrderArray {
    public static void main(String[] args) {
        // Create object of AscendingArray class
        AscendingArray obj = new AscendingArray();

        // Call methods to input, sort, and display
        obj.inputNumbers();
        obj.sortAscending();
        obj.displaySorted();
    }
}
