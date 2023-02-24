import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int [] inputArray=readIntegers();
        findMin(inputArray);
    }

    private static int[] readIntegers(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Write comma delimited numbers");
        String input=scan.nextLine();

        String [] inputStringArray=input.split(",");
        int [] intArray=new int[inputStringArray.length];

        for(int i=0;i<inputStringArray.length; i++ ){
            intArray[i]=Integer.parseInt(inputStringArray[i].trim());
        }

        System.out.println(Arrays.toString(intArray));
        return intArray;

    }

    private static int findMin(int[] array){
        int number=Integer.MAX_VALUE;
        System.out.println(number);
        for(int i=0; i<array.length; i++){
            if(array[i]<number){
                number=array[i];
            }
        }
        System.out.println("Min number is= "+number);
        return number;
    }
}
