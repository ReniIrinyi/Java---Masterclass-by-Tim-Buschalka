public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(22,23,34));
    }

    public static boolean hasSameLastDigit(int nr1, int nr2, int nr3){
      boolean sameLastDigit=false;
        int counter1=0;
        int counter2=0;
        int counter3=0;
      if(isValid(nr1) && isValid(nr2) && isValid(nr3)){
          for(int i=nr1; i!=0; i/=10){
              for(int j=nr2; j!=0; j/=10){
                  for(int z=nr3; z!=0; z/=10){
                      while(counter1 <1 && counter2<1 && counter3<1){
                          if(i%10==j%10 || j%10==z%10 || z%10==i%10)
                          {
                              counter1++;
                              counter2++;
                              counter3++;
                              sameLastDigit=true;
                          }   else {
                              sameLastDigit=false;
                              break;
                          }
                      };
                break;
                  };
              break;
              }
          break;
          };
      }
      return sameLastDigit;
    };

    public static boolean isValid(int nr){
        return nr >=10 && nr<=1000 ? true : false;
    }
}
