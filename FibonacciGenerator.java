public class FibonacciGenerator {
    public static void main(String[] args) {
        int terms = 10;  // Predefined number of terms

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
