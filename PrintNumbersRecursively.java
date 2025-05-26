public class PrintNumbersRecursively {
    public static void main(String[] args) {
        printNumbers(1, 1000);
    }

    public static void printNumbers(int current, int limit) {
        if (current > limit) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, limit);
    }
}
