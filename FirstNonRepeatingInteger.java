public class FirstNonRepeatingInteger {
    public static int findFirstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return i; // Return the index of the first non-repeating integer
            }
        }
        return -1; // If no non-repeating integer is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 2};
        int index = findFirstNonRepeating(arr);
        System.out.println("Index of first non-repeating integer: " + index);
    }
}
