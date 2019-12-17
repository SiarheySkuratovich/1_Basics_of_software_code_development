import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        System.out.println("Enter how much seconds have passed");
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();
        int hours = timeInSeconds / SEC_PER_HOUR;
        int minutes = (timeInSeconds - (hours * SEC_PER_HOUR)) / SEC_PER_MIN;
        int seconds = timeInSeconds - (hours * SEC_PER_HOUR) - (minutes * SEC_PER_MIN);
        System.out.println("It took: " + hours + "H " + minutes + "M " + seconds + "S");
    }
}
