import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line segment:");
        LineSegment lineSegment = new LineSegment();
        System.out.println("from a: ");
        lineSegment.setA(scanner.nextDouble());
        System.out.println("To b:");
        lineSegment.setB(scanner.nextDouble());
        System.out.println("And enter step h:");
        double step = scanner.nextDouble();
        int numberOfSteps = (int)((lineSegment.getB() - lineSegment.getA()) / step);
        double upperArgOfFuncOnLineSegment = lineSegment.getA() + numberOfSteps * step;
        Func func = new Func();
        for (double i = lineSegment.getA(); i <= upperArgOfFuncOnLineSegment; i += step) {
            System.out.println("y = " + func.getY(i));
        }
    }
}
