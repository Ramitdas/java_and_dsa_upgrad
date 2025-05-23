public class SubarrayCounter {
    public static int countSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int windowSum = 0;

        // Initial sum for first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Check first window
        if ((double) windowSum / k >= threshold) {
            count++;
        }

        // Sliding window approach
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if ((double) windowSum / k >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int k = 2;
        int threshold = 3;
        System.out.println(countSubarrays(arr, k, threshold)); // Output: 2
    }
}
