public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);

    }

    public static void printFactors(int nr){
        if(nr < 1 ){
            System.out.println("Invalid Value");
        } else {
            for(int i=1;i<=nr; i++ ){
                while(nr%i==0) {
                    System.out.println(i);
                    break;
                }
                }
            }
        }


}
