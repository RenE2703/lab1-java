import java.util.Scanner;

public class Exercise05MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + ((long) n * i));
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            printMultiplicationTable(n);
        }
    }
}
