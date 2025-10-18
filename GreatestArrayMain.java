import java.util.Scanner;

// Class to handle array operations
class GreatestArray {
    int[] numbers = new int[15];
    private Scanner sc = new Scanner(System.in);

    // Method to input 15 numbers
    void inputNumbers() {
        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
    }

    // Method to find and return the greatest number
    int findGreatest() {
        int greatest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        return greatest;
    }

    // Close scanner when done
    void closeScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}

// Main class — filename must be GreatestArrayMain.java
public class GreatestArrayMain {
    public static void main(String[] args) {
        GreatestArray obj = new GreatestArray();

        obj.inputNumbers();                 // input 15 numbers
        int max = obj.findGreatest();       // compute greatest
        System.out.println("The greatest number is: " + max);
        obj.closeScanner();                 // close scanner
    }
}
