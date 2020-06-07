import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println(num >= 10 && num <= 20 && !weekend || num >= 15 && num <= 25 && weekend);
    }
}