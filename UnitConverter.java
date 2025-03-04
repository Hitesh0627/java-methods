public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
         
        // Convert kilometers to miles
        double km = 10;
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
        
        // Convert miles to kilometers
        double miles = 5;
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
        
        // Convert meters to feet
        double meters = 100;
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
        
        // Convert feet to meters
        double feet = 50;
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
}
