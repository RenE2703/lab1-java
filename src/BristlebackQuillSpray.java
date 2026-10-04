import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class BristlebackQuillSpray {
    public static double totalDamage(double[] times, double x, double y, double z) {
        if (times.length == 0) {
            return 0;
        }

        int firstActive = 0;
        double total = 0;
        BigDecimal duration = BigDecimal.valueOf(z);
        BigDecimal oldestExpiry = BigDecimal.valueOf(times[0]).add(duration);

        for (int i = 0; i < times.length; i++) {
            BigDecimal currentTime = BigDecimal.valueOf(times[i]);
            while (firstActive < i && currentTime.compareTo(oldestExpiry) > 0) {
                firstActive++;
                oldestExpiry = BigDecimal.valueOf(times[firstActive]).add(duration);
            }

            int embeddedQuills = i - firstActive;
            total += x + embeddedQuills * y;
        }
        return total;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);
            int n = scanner.nextInt();
            if (n < 0 || n >= 10000) {
                throw new IllegalArgumentException("n phai thuoc khoang [0, 10000).");
            }

            double[] times = new double[n];
            for (int i = 0; i < n; i++) {
                times[i] = scanner.nextDouble();
            }
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();

            double damage = totalDamage(times, x, y, z);
            System.out.println(BigDecimal.valueOf(damage).stripTrailingZeros().toPlainString());
        }
    }
}
