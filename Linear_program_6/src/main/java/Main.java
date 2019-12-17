import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dot dot = new Dot();
        System.out.println("Enter coordinates of dot:");
        System.out.println("X: ");
        dot.setX(scanner.nextInt());
        System.out.println("Y: ");
        dot.setY(scanner.nextInt());
        if(contains(dot)) {
            System.out.println("Area contains dot");
        } else {
            System.out.println("Area does't contain dot");
        }
    }
    public static boolean contains(Dot dot) {
        SubArea1 subArea1 = new SubArea1();
        SubArea2 subArea2 = new SubArea2();
        return subArea1.contains(dot) || subArea2.contains(dot);
    }
}
