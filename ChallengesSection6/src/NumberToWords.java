import java.sql.SQLOutput;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        System.out.println(reverse(10));
        System.out.println("count: "+getDigitCount(123));
        System.out.println("count: "+getDigitCount(0));
        System.out.println("count: "+getDigitCount(101));
    }

    public static void numberToWords(int number){

    for(int i=reverse(number); i!=0; i/=10){
        if (number==0) System.out.print("Zero ");
        if (number<0) System.out.println("Invalid Value");
        int nr=i%10;
        if (nr==0) System.out.print("Zero ");
        if (nr==1) System.out.print("One ");
        if (nr==2) System.out.print("Two ");
        if (nr==3) System.out.print("Three ");
        if (nr==4) System.out.print("Four ");
        if (nr==5) System.out.print("Five ");
        if (nr==6) System.out.print("Six ");
        if (nr==7) System.out.print("Seven ");
        if (nr==8) System.out.print("Eight ");
        if (nr==9) System.out.print("Nine ");
}

    };
    public static int reverse(int nr){
        int reversNr=0;
      while (nr>0) {
          reversNr=reversNr*10+nr%10;
          nr=nr/10;
      }
      return reversNr;
    };

    public static int getDigitCount(int number){
     int digitCount=0;
     if(number<0) digitCount=-1;
    if(number==0) digitCount=1;
         for(int i=number; i!=0; i/=10) {
                 while (i > 0) {
                     digitCount++;
                     break;
                 }
             }

             return digitCount;
         }
}
