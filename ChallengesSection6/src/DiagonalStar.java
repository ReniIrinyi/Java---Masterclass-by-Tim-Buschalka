public class DiagonalStar {
    public static void main(String[] args) {
    printSquareStar(8);

    }

    public static void printSquareStar(int number){
        if(number>=5){
        for(int row=0; row<number; row++){
            for(int column=0; column<number;column++){
                if( row==0 || column==0 || number-1==column || number-1==row || column==row || column+row==number-1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
        else System.out.println("Invalid Value");
    };
}
