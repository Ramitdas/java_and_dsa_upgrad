import java.util.Scanner;

public class SubarrayCounter2 {
    public static int countSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        double windowSum = 0.0;

        // Initial sum for first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Check first window
        if (windowSum / k >= threshold) {
            count++;
        }

        // Sliding window approach
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum / k >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input k and threshold
        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();
        System.out.print("Enter value of threshold: ");
        int threshold = scanner.nextInt();

        // Call function and print result
        System.out.println("Count of valid subarrays: " + countSubarrays(arr, k, threshold));

        scanner.close();
    }
}
