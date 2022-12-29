public class FoorStatementChallenge {

    public static void main(String[] args) {
        System.out.println("0 is"  + (isPrime(0)? "" : " NOT ") + " a prime number");
        System.out.println("2 is"  + (isPrime(2)? "" : " NOT ") + " a prime number");
        System.out.println("8 is"  + (isPrime(8)? "" : " NOT ") + " a prime number");
        System.out.println("17 is"  + (isPrime(17)? "" : " NOT ") + " a prime number");

        int primenr=0;
        for(int i=10; i<=50; i++){
        if(isPrime(i)){
            primenr++;
            System.out.println(i);
             if(primenr==10){
                 break;
             }
            };
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber == 2);
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber%i==0){

                return false;
            }
        }
        return true;
    };
}
