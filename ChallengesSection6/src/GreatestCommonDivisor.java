import java.sql.SQLOutput;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Common divisor:"+getGreatestCommonDivisor( 25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int commonDivisor=0;
        if(first < 10 || second < 10){
            commonDivisor=-1;
        } else {
            for (int i = 1; i <= (first + second) / 2; i++) {
                if (first % i == 0 && second % i == 0) {
                    commonDivisor = i > commonDivisor ? i : commonDivisor;
                }
            }
        }
        return commonDivisor;
    };
}
