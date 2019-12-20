import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of 1st dot:");
        Dot[] dot = new Dot[3];
        for (int i = 0; i < 3; i++) {
            dot[i] = new Dot();
            System.out.println("x: ");
            dot[i].setX(scanner.nextInt());
            System.out.println("y:");
            dot[i].setY(scanner.nextInt());
        }

        LineOfTwoDots lineOfTwoDots = new LineOfTwoDots(dot[0], dot[1]);
        if(lineOfTwoDots.checkIfLiesOnTheLine(dot[2])) {
            System.out.println("Dots lie on the line");
        } else {
            System.out.println("dots don't lie on the line");
        }
    }
}
