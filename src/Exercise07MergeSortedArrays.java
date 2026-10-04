import java.util.Scanner;

public class Exercise07MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }
        while (i < first.length) {
            merged[k++] = first[i++];
        }
        while (j < second.length) {
            merged[k++] = second[j++];
        }
        return merged;
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

    public static void printArray(int[] array) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                output.append(' ');
            }
            output.append(array[i]);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] first = readArray(scanner, n);
            int m = scanner.nextInt();
            int[] second = readArray(scanner, m);
            printArray(mergeSortedArrays(first, second));
        }
    }
}
