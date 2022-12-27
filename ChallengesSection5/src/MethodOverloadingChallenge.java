public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println( convertToCentimeters(5, 8) +"cm");
    }

    public static double convertToCentimeters(int hinches) {
        return hinches * 2.54;
    };

    public static double convertToCentimeters(int hfeet, int rehinch) {
        return  convertToCentimeters((hfeet*12)+rehinch) ;

    }

    ;
}
