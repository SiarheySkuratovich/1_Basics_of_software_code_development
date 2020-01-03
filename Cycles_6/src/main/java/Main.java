import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("print a symbol:");
        Scanner scanner = new Scanner(System.in);
        int symbol = scanner.next().charAt(0);
        System.out.println(symbol);
    }
}
