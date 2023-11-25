import java.util.Scanner;

class Prime {
    public static void checkPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Create an instance of the Prime class
        Prime prime = new Prime();

        // Call checkPrime method for each input
        prime.checkPrime(num1);
        prime.checkPrime(num2);
        prime.checkPrime(num3);
        prime.checkPrime(num4);
    }
}
