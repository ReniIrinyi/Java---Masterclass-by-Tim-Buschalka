import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class InputCalculator {
    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        int counter=0;
        int sum=0;
        int avg=0;
        int avgcount=0;
        while(counter<=5){
            String newInput=scanner.nextLine();
            try{
                for(int i=parseInt(newInput);i<=parseInt(newInput);i++){
                    sum+=i;
                    avgcount++;
                    avg=sum/avgcount;

                }
                counter++;
            }catch(NumberFormatException nfe){
                System.out.println("SUM = " +sum + " AVG = " +avg);
                break;
            };
            if(counter==5){
                System.out.println("SUM= "+sum + "AVG= "+avg);
            }

        }
    }

}
