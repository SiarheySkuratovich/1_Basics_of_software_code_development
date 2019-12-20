import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a brick sizes");
        Brick brick = new Brick();
        System.out.println("a: ");
        brick.setA(scanner.nextDouble());
        System.out.println("b: ");
        brick.setB(scanner.nextDouble());
        System.out.println("c: ");
        brick.setC(scanner.nextDouble());

        Hole hole = new Hole();
        System.out.println("Enter hole sizes:");
        System.out.println("x: ");
        hole.setX(scanner.nextDouble());
        System.out.println("y: ");
        hole.setY(scanner.nextDouble());

        if (brick.passes(hole)) {
            System.out.println("the Brick passes the hole");
        } else {
            System.out.println("the Brick doesn't pass the hole");
        }
    }
}
