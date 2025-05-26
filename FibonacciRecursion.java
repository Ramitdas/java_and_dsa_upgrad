public class FibonacciRecursion {
    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return; // Stop when n reaches 0
        }
        System.out.print(a + " ");
        fibo(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        int n = 15; // Number of terms
        System.out.println("Fibonacci series up to " + n + " terms:");
        fibo(0, 1, n);
    }
}
  
