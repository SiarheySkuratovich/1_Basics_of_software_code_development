import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some positive integer:");
        int number = scanner.nextInt();
        System.out.println("The sum from 1 to " + number+ " is: " + calc(number));
    }

    public static int calc(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
