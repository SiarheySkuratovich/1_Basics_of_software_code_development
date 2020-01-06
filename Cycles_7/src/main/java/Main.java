import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a interval from m to n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("m: ");
        int m = scanner.nextInt();
        System.out.println("n: ");
        int n = scanner.nextInt();

        LinkedList<Integer> listOfDividers;
        for (int i = m; i <= n; i++) {
            listOfDividers = getListOfDividers(i);
            if (listOfDividers.isEmpty()) {
                System.out.println(i + ": can be divided only by 1 and by itself");
            } else {
                System.out.println(i + ": dividers: " + listOfDividers);
            }
        }
    }

    public static LinkedList<Integer> getListOfDividers(int i) {
        LinkedList<Integer> dividersList = new LinkedList<Integer>();
        for (int j = 2; j < i ; j++) {
            if (i % j == 0) {
                dividersList.addLast(j);
            }
        }
        return dividersList;
    }
}
