import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        Func func = new Func(scanner.nextDouble());
        System.out.println("Function solution is: " + func.calc());
    }
}
