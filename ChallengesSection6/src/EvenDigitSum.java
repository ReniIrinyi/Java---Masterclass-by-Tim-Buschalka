public class EvenDigitSum {
    public static void main(String[] args) {
        //System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(2524));
        //System.out.println(getEvenDigitSum(-1));
    }

    public static int getEvenDigitSum(int number){
        int nr=0;
      if(number < 0) return -1;
      for(int i=number; i!=0; i/=10){
          if(i % 2==0){
             nr+=+i%10;
          }
      };
     return nr;
    };


}
