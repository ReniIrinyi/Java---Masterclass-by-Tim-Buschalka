public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(515));
        System.out.println(isPalindrome(516));
        System.out.println(isPalindrome(-212));

    }

    public static boolean isPalindrome(int number){
        int reverse=0;
        int nr=number;
        while(nr!=0 ){
            int lastDigit=nr%10;
            reverse=(reverse*10)+lastDigit;
            nr=nr/10;

        };

       if (reverse == number) {
           System.out.println(reverse + " = "+number);

       return true;
       } else {
           System.out.println(reverse + " ≠ "+number);
           return false;
       }

    };
}
