package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remOf3 = scanner.nextInt();
        int remOf5 = scanner.nextInt();
        int remOf7 = scanner.nextInt();
        int age = (remOf3 * 70 + remOf5 * 21 + remOf7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
