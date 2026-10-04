import java.util.Scanner;

public class Exercise04ReverseString {
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text.length());
        int position = text.length();
        while (position > 0) {
            int codePoint = text.codePointBefore(position);
            reversed.appendCodePoint(codePoint);
            position -= Character.charCount(codePoint);
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.hasNextLine() ? scanner.nextLine() : "";
            System.out.println(reverseString(text));
        }
    }
}
