import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] abc = new int[3];
        final int LETTER_A = 97;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        for (int i = LETTER_A; i < LETTER_A + 3; i++) {
            System.out.println((char)i + ": ");
            abc[i - LETTER_A] = scanner.nextInt();
        }
        System.out.println("The answer is: " + calc(abc));
    }

    public static double calc(int[] abc) {
        return ((abc[0] + Math.sqrt((abc[1] * abc[1]) + (4 * abc[0] * abc[2]))) /
                (2 * abc[0])) - Math.pow(abc[0], 3) * abc[2] + Math.pow(abc[1], -2);
    }
}
