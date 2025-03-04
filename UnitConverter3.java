public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Testing the UnitConverter methods
        
        // Convert Fahrenheit to Celsius
        double fahrenheit = 98.6;
        System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
        
        // Convert Celsius to Fahrenheit
        double celsius = 37;
        System.out.println(celsius + "°C is " + convertCelsiusToFahrenheit(celsius) + "°F.");
        
        // Convert pounds to kilograms
        double pounds = 150;
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        
        // Convert kilograms to pounds
        double kilograms = 68;
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        
        // Convert gallons to liters
        double gallons = 5;
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        
        // Convert liters to gallons
        double liters = 20;
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}



