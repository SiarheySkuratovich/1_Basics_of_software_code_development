import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Answer is: " + calc(Math.PI, Math.PI));
    }

    public static double calc(double x, double y) {
        return ((sin(x) + cos(y)) /
        cos(x) - sin(y)) * Math.tan(x * y);
    }
}
