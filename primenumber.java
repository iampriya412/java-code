public class primenumber {

    public static boolean isPrime(int number) {
        // Check if number is less than 2, then it's not a prime number
        if (number < 2) {
            return false;
        }
        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If a factor is found, then it's not a prime number
                return false;
            }
        }
        // If no factors were found, then it's a prime number
        return true;
    }

    public static void main(String[] args) {
        int number = 29; // Example number to check
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
