import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int n = 1;
        long fact = -1;
        while (fact <= num) {
            fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            n++;
        }
        System.out.println(n - 1);
    }
}