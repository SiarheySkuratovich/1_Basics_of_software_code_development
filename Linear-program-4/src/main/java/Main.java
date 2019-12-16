import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double realNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real number with nnn,ddd format: ");
        try {
            realNumber = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Is it through ','? Try once more.");
            return;
        }
        System.out.println("ddd.nnn is " + reverse(realNumber));
    }

    public static double reverse(double realNumber) {
        double modulo = realNumber * 1000 % 1000;
        double integerOfNum = (int) realNumber;
        return modulo + (integerOfNum / 1000);
    }
}
