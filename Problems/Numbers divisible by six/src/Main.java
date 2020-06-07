import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int currNum = scanner.nextInt();
            if (currNum % 6 == 0) {
                total += currNum;
            }
        }
        System.out.println(total);
    }
}