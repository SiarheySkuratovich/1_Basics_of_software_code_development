import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Print a, b, c, d");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)(97 + i) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(func(arr));
    }
    public static int func(int[] arr) {
        return Math.max(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
    }
}
