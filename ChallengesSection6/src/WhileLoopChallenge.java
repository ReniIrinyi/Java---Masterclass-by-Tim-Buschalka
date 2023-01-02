public class WhileLoopChallenge {
    public static void main(String[] args) {
     int start=4;
     int end=20;
     int totalEven=0;
     int totalOdd=0;
        while (start <=end){
            start++;
                if(isEvenNumber(start))  {
                    totalEven++;
                    System.out.println("Even: "+start);
                } else {
                    totalOdd++;
                    System.out.println("Odd: "+start);
                }
        }
        System.out.println("Sum of total odd numbers= "+ totalOdd);
        System.out.println("Sum of total even numbers= "+ totalEven);
    }
    public static boolean isEvenNumber(int nr){
       return nr % 2 ==0 ? true : false;
    };
}
