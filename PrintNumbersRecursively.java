public class PrintNumbersRecursively {
    public static void main(String[] args) {
        increment(1); // Start from 1
        decrement(1000); // Start from 1000
    }

    public static void increment(int k) {
        if (k > 1000) { // Limit remains at 1000
            return;
        }
        System.out.println(k);
        increment(k + 1); // Increase k in each recursive call
    }

     public static void decrement(int c) {
        if (c < 1) { // Stop when c goes below 1
            return;
        }
        System.out.println(c);
        decrement(c - 1); // Decrease c in each recursive call
    }
}
