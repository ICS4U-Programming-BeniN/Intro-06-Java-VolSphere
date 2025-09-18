import java.util.Scanner;

/**
 * Asks the volume of a sphere.
 * Then tells the volume.
 * 
 * @author Beni Nkongolo
 * @version 1.0
 * @since 2025-09-17
 */

public final class VolSphere {
    /**
     * To satisfy style checker.
     * 
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * Main.
     * 
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Welcome the user.
        System.out.println("Calculate the volume of a circle!");
        System.out.println("What is the radius of your circle");

        // To get user input
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // Convert to double.
        final double radDouble = Double.parseDouble(radString);

        // If negative.
        if (radDouble < 0) {
            System.out.println("The radius can't be negative.");
        } else {
            // Calculate volume
            final double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.print("The volume of the circle is");
            System.out.print(radString + "cm, is ");
            System.out.format("%.3f", volume);
            System.out.println("cm^2.");
        }

        // Closing scanner
        scanner.close();
    }
}