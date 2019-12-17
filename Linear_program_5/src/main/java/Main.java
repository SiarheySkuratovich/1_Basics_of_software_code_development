import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter how much seconds have passed");
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();
        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds - (hours * 3600)) / 60;
        int seconds = timeInSeconds - (hours * 3600) - (minutes * 60);
        System.out.println("It took: " + hours + "H " + minutes + "M " + seconds + "S");

    }
}
