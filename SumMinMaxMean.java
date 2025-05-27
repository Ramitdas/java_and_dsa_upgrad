import java.util.Scanner;

public class SumMinMaxMean {

    // Recursive method to find the sum of the array
    public static int findSum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + findSum(arr, index + 1);
    }

    // Recursive method to find the minimum element
    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    // Recursive method to find the maximum element
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = findSum(arr, 0);
        int min = findMin(arr, 0);
        int max = findMax(arr, 0);
        double mean = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scanner.close();
    }
}
