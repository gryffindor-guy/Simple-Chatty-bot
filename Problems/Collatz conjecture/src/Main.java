import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                num = num / 2;
            } else {
                System.out.print(num + " ");
                num = num * 3 + 1;
            }
        }
        System.out.print(1);
    }
}