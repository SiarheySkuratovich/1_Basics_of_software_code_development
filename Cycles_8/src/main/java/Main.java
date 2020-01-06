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

        HashSet<Integer> digitsOfFirstNumber = getSetOfDigits(number1);
        HashSet<Integer> digitsOfSecondNumber = getSetOfDigits(number2);
        HashSet<Integer> commonDigits = new HashSet<Integer>();
        commonDigits.addAll(digitsOfFirstNumber);
        commonDigits.retainAll(digitsOfSecondNumber);
        System.out.println("Common digits: " + commonDigits);
        System.out.println(digitsOfFirstNumber);
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
