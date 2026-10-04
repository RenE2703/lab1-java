import java.util.Scanner;

public class Exercise01EvenOdd {
    public static void printNumbers(int n) {
        for (long i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Even");
            } else {
                System.out.println(i + " - Odd");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            printNumbers(n);
        }
    }
}
