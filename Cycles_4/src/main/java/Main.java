import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter e");
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        System.out.println("sum = " + getSum(e));

    }

    public static double getSum(double e) {
        double n = 0;
        double an = 0;
        double sum = 0;
        while (true) {
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (an < e) break;
            sum += an;
            n++;
        }
        return sum;
    }
}
