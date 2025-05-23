Prefix sum:


import java.util.Scanner;

public class preFixSum {
    //the prefix sum at index i is the sum of all elements from start of the array upto index i

    // 2 4 1 3  5
    // 2 6 7 10 15
    // i = 0 => 2
    // i = 1 => 6
    //2-> 7
    //3-> 10
    //4->15
    //get sum from index 1 to 3
    //prefix[3] - prefix[0] = 10 - 2 = 8


    public static int preFixSumFun(int[] arr, int start, int end) {
        int[] preFixSum = new int[arr.length];
        preFixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            preFixSum[i] = preFixSum[i - 1] + arr[i];
        }

        return preFixSum[end] - preFixSum[start - 1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int startIdx = 1;
        int endIdx = 3;

        System.out.println(preFixSumFun(arr,startIdx,endIdx));
    }
}
