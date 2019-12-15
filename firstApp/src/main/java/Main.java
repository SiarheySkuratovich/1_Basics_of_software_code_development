import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Please. enter a, b and c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        a = scanner.nextInt();
        System.out.println("b:");
        b = scanner.nextInt();
        System.out.println("c:");
        c = scanner.nextInt();
        ZObject z = new ZObject(a, b, c);
        System.out.println("Z = " + z.calc());
    }

}
