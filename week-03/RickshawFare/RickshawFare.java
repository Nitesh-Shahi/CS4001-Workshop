import java.util.Scanner;
public class RickshawFare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
          
        //fare components
        double baseFare = 50;
        double perKmCharge = 20;
        double perMinuteCharge = 2;
        
        //user input
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer a local? (true/false): ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.print("Is the travel during night? (true/false): ");
        boolean isNight = sc.nextBoolean();
        
        //calcuate base fare
        double totalFare = baseFare + (distance * perKmCharge) + (time * perMinuteCharge);
        
        
        //discount for locals on long distance(10% if distance >= 10 km)
        totalFare = (isLocal && distance >=10) ? totalFare * 0.9 : totalFare;
        
        //night surcharge (20% extra)
        totalFare = isNight ? totalFare * 1.2 : totalFare;
        
        //display result
        System.out.println("\n-----------Rickshaw Fare Receipt--------");
        System.out.println("Distance: " + distance + "km");
        System.out.println("Time: " + time + "minutes");
        System.out.println("Final Fare: Rs." + totalFare);
        sc.close();
    }
}