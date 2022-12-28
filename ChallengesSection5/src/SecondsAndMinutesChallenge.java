public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-99999));
    }
    public static String getDurationString(int seconds){
        return seconds > 0  ? getDurationString(seconds/60, seconds%60) : "Invalid input";
    };
    public static String getDurationString(int minutes, int seconds){
        int hours= minutes/60;
        int remMinutes=  minutes%60;
        int remSeconds= seconds%60;
        return hours + "h " + remMinutes + "m " + remSeconds + "s";
    };
}
