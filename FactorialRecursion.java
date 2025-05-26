public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial of any number
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
