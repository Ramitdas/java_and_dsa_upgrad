public class PrintNumbersRecursively {
    public static void main(String[] args) {
        increment(1); // Start from 1
    }

    public static void increment(int k) {
        if (k > 1000) { // Limit remains at 1000
            return;
        }
        System.out.println(k);
        increment(k + 1); // Call recursively
    }
}
