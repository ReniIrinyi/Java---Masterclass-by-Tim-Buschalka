public class Sum3and5Challenge {

    public static void main(String[] args) {
        int nr=0;
        int countnr=0;
        for (int i=1; i<=1000; i++){
            if(i % 5 ==0 && i % 3==0){
                System.out.println("Maatching: "+i);
                nr+=i;
                countnr++;
            }
            if(countnr==5){
                break;
            }
        };
        System.out.println("Count of matches: "+countnr);
        System.out.println("Sum of matches: "+nr);
    }
}
