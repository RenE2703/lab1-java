import java.util.Scanner;

public class Exercise03SumOfDigits {
    public static int sumOfDigits(int number) {
        long remaining = number;
        if (remaining < 0) {
            remaining = -remaining;
        }

        int sum = 0;
        while (remaining > 0) {
            sum += (int) (remaining % 10);
            remaining /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(sumOfDigits(number));
        }
    }
}
