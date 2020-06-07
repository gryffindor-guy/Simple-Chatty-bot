import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int D = 0;
        int C = 0;
        int B = 0;
        int A = 0;
        for (int i = 0; i < n; i++) {
            int curr = scanner.nextInt();
            if (curr == 2) {
                D++;
            } else if (curr == 3) {
                C++;
            } else if (curr == 4) {
                B++;
            } else {
                A++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}