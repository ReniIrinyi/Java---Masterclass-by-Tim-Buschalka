import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter=1;
        int sum=0;

        while(counter<=5){
            System.out.println("Enter a number #"+counter+":");
            String nextNumber=scanner.nextLine();
            try{int number=Integer.parseInt(nextNumber);
            sum+=number;
            counter++;
            } catch(NumberFormatException nfe){
                System.out.println("Invalid Number");
            }

        }
        System.out.println("The sum of the numbers="+sum);
    }


}
