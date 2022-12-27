public class SpeedConverter {
    public static void main(String[] args) {
printConversion(1.5);
printConversion(10.25);
printConversion(-5.6);
printConversion(25.42);
printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour ){
        return kilometersPerHour >= 0 ? Math.round((kilometersPerHour/1.609)) : -1;
    };

    public static void printConversion(double kilometersPerHour){
        long milesPerHour=toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour>=0? kilometersPerHour + " km/h = " + milesPerHour + " mi/h":"Invalid Value");
    };
}
