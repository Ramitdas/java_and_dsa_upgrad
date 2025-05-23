public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 7, 9, 6, 2, 4, 10};
        int subarraySize = 3;
        int maxSum = findMaxSumSubarray(array, subarraySize);
        System.out.println("Maximum sum of subarray of size " + subarraySize + " is: " + maxSum);
    }

    public static int findMaxSumSubarray(int[] array, int subarraySize) {
        int maxSum = Integer.MIN_VALUE;  // or take 0 
        for (int i = 0; i <= array.length - subarraySize; i++) {
            int currentSum = 0;
            for (int j = i; j < i + subarraySize; j++) {
                currentSum += array[j]; // currentSum = currentSum + array[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
