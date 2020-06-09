import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        double A = a;
        double B = b;
        return A / B;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}