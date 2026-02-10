public class PrimeNumbers1To100 {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {

            boolean isPrime = true; // Assume number is prime

            // Check divisibility from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false; // Not a prime number
                    break;
                }
            }

            // If number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
