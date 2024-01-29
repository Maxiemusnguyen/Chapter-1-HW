import java.util.Scanner;

public class SpeedLight {
    public static void main(String[] args) {
        double speedOfSound = 340.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time elapsed (in seconds): ");
        double timeElapsed = scanner.nextDouble();

        double distance = speedOfSound * timeElapsed;

        System.out.println("The distance to the lightning strike is approximately: " + distance + " meters");

        scanner.close();
    }
}
