import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }
    }
}