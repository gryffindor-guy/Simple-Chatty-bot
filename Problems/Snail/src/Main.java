import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int count = 0;
        int currHeight = 0;
        while (currHeight + B < height) {
            currHeight += A;
            currHeight -= B;
            count++;
        }
        System.out.println(count);
    }
}