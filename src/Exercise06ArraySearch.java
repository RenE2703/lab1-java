import java.util.Scanner;

public class Exercise06ArraySearch {
    public static int findFirstIndex(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] readArray(Scanner scanner, int length) {
        if (length < 0) {
            throw new IllegalArgumentException("So phan tu phai khong am.");
        }
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] array = readArray(scanner, n);
            int x = scanner.nextInt();
            System.out.println(findFirstIndex(array, x));
        }
    }
}
