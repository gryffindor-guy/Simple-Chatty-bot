import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 1;
        int currHeight = scanner.nextInt();
        while (height < currHeight && scanner.hasNextInt()) {
            count++;
            currHeight = scanner.nextInt();
        }
        if (n == count) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + count);
        }
    }
}