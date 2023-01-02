public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number){
      int sumDivisor=0;
      for(int i=1; i<number; i++){
          while(number % i==0){
              sumDivisor+=i;
              break;
          };
      };
       return sumDivisor==number && number > 0 ? true : false;
    };
}
