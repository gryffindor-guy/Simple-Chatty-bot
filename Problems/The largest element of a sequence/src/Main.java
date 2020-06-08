import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = -1;
        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(max);
    }
}