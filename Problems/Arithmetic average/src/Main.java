import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        double count = 0;
        double sum = 0;
        for (int i = start; i < end + 1; i++) {
            if (i % 3 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}