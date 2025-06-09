import java.util.Arrays;

public class MergeSortExample2 {
    // Merge Sort function
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] l = Arrays.copyOfRange(arr, 0, mid);
        int[] r = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);
    }

    // Merge function to combine two sorted arrays
    public static void merge(int[] arr, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;

        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < l.length) {
            arr[k++] = l[i++];
        }

        while (j < r.length) {
            arr[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
