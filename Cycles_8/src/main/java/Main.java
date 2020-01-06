import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Number 2:");
        int number2 = scanner.nextInt();

        HashSet<Integer> digits = getSetOfDigits(number1);
        int digitOfNumber2;
        do {
            digitOfNumber2 = number2 % 10;
            if (digits.contains(digitOfNumber2)) {
                System.out.println("common digit: " + digitOfNumber2);
            }
            number2 /= 10;
        } while (number2 != 0);
    }

    public static HashSet<Integer> getSetOfDigits(int number) {
        HashSet<Integer> digits = new HashSet<Integer>();
        int digit;
        do {
            digit = number % 10;
            digits.add(digit);
            number /= 10;
        } while (number != 0);
        return digits;
    }

}
