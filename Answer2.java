import java.util.Scanner;

public class MinMaxSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Length of segment 'k'
        int k = scanner.nextInt();

        // Input: Size of the array 'n'
        int n = scanner.nextInt();

        // Input: Array 'arr'
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output: Maximum of the minimums
        int result = maxOfMinSegment(k, arr);
        System.out.println(result);
    }

    // Function to calculate the maximum of the minimums for each sub-array of length 'k'
    private static int maxOfMinSegment(int k, int[] arr) {
        int maxOfMins = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int minInSegment = Integer.MAX_VALUE;

            for (int j = i; j < i + k; j++) {
                minInSegment = Math.min(minInSegment, arr[j]);
            }

            maxOfMins = Math.max(maxOfMins, minInSegment);
        }

        return maxOfMins;
    }
}
