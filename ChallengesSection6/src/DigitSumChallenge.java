public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(111));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sumOfDigits=0;
        while(number>9 ){
               sumOfDigits+=number%10;
               number=number/10;
            }
        sumOfDigits +=number;
        return sumOfDigits;
        }
    };

