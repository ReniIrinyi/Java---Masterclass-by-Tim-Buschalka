import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {

    public static void main(String[] args) {
        int[] randomArray= getRandomArray(5);
        System.out.println(Arrays.toString(randomArray));
        getSortedArray(randomArray);
    }

    public static int[] getRandomArray(int length){
        int[] randomArray = new int [length];
        Random random=new Random();
        for(int i=0; i<randomArray.length; i++) {
            randomArray[i]=random.nextInt(10);
        };
        return randomArray;
    };

    public static int[] getSortedArray(int [] array){
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
        return array;
    }
}




