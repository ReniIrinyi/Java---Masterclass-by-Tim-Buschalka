public class DecimalComperator {
    public static void main(String[] args) {
    areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    areEqualByThreeDecimalPlaces(3.175, 3.176);
    areEqualByThreeDecimalPlaces(3.0, 3.0);
    areEqualByThreeDecimalPlaces(-3.123, 3.123);
    areEqualByThreeDecimalPlaces(-3.1756, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double nr1, double nr2){
        //System.out.println((int)(nr1*1000) == (int)(nr2*1000) ? "true" : "false");
        return (int)(nr1*1000) == (int)(nr2*1000) ? true : false;
    };
}