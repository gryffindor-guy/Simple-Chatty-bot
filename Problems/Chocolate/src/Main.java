import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int target = scanner.nextInt();

        if (target <= rows * columns && (target % rows == 0 || target % columns == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}