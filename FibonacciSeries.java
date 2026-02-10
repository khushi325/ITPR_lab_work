public class FibonacciSeries {

    public static void main(String[] args) {

        // Number of terms to be printed
        int terms = 30;

        // First two Fibonacci numbers
        long first = 0;
        long second = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        // Loop to generate Fibonacci numbers
        for (int i = 1; i <= terms; i++) {

            // Print the current Fibonacci number
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            long next = first + second;

            // Update values for next iteration
            first = second;
            second = next;
        }
    }
}
