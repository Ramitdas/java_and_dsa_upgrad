public class SlidingWindowMaxSum {
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;

        // Compute sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];  // Add new element, remove old one
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 9, 6, 2, 4, 10};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
    }
}
