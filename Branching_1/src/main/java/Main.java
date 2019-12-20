import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Enter 2 angle of triangle: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st angle:");
        double angle1 = scanner.nextDouble();
        System.out.println("2nd angle:");
        double angle2 = scanner.nextDouble();
        if (!isTriangle(angle1, angle2)) {
            throw new InputMismatchException();
        }
        if (Double.compare(angle1 + angle2, 90) == 0 || angle1 == 90 || angle2 == 90) {
            System.out.println("triangle is rectangular");
        } else {
            System.out.println("triangle is NOT rectangular");
        }
    }
    public static boolean isTriangle(double angle1, double angle2) {
        int flag = Double.compare(angle1 + angle2, 180);
        int flagIfAngle1IsPositive = Double.compare(angle1, 0);
        int flagIfAngle2IsPositive = Double.compare(angle2, 0);
        return flag == -1 && flagIfAngle1IsPositive == 1 && flagIfAngle2IsPositive == 1;
    }
}
