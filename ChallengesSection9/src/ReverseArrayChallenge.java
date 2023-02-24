import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        reverse(array);
        System.out.println("- + -".repeat(15));
        reverseImproved(array);
    }

    //First Solution

    private static int[] reverse(int[] array){
        int[]currentArray=array;
        int[]swappedArray=new int[array.length];
        int counter=0;

        for(int i=array.length-1; i>=0; i--){
            swappedArray[counter]=currentArray[i];
            counter++;
        }

        System.out.println(Arrays.toString(swappedArray));
        return swappedArray;
    }


    //Improved => only 2 iterations

    private static int[] reverseImproved(int [] array){
        int[]swappedArray=array;
        int maxIndex=swappedArray.length-1;
        int halfIndex=swappedArray.length/2;

        for(int i=0; i<halfIndex; i++){
            int temp=swappedArray[i];
            swappedArray[i]=swappedArray[maxIndex-i];
            swappedArray[maxIndex-i]=temp;

        }
        System.out.println(Arrays.toString(swappedArray));
        return swappedArray;
    }

}
