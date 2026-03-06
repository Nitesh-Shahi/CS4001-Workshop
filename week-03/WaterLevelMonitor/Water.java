import java.util.Scanner;
public class Water {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter current water level (in liters): ");
    double waterLevel = sc.nextDouble();
    System.out.println("Current Water Level: " + waterLevel + " liters");
    String message = (waterLevel >= 1000)
    ? "WARNIG: Water level has reached 1000L or more!"
    : "Status: Normal";
    System.out.println(message);
    sc.close();
}
} 