public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(25));
        System.out.println(sumFirstAndLastDigit(-25));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(2578));
    }

    public static int sumFirstAndLastDigit(int nr){
      int sum=0;
      if (nr <0) sum= -1;
      else if(nr/10 == 0){
          sum+=(nr+nr);
      } else {
        int firstDigit=nr%10;
        int lastDigit=0;
        for(int i=nr; i!=0; i/=10){
            lastDigit=i%10;
        };
        sum=firstDigit+lastDigit;
      }
      return sum;
    };
}
