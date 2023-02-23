import java.util.Arrays;
import java.util.Random;

public class ArraysProject {
    public static void main(String[] args) {
        int[] myIntArray=new int[10];
        myIntArray[0]=45;
        myIntArray[1]=1;
        myIntArray[5]=50;
        System.out.println(myIntArray[5]);

        double[]myDoubleArray=new double[10];
        myDoubleArray[2]=2.3;
        System.out.println(myDoubleArray[2]);

        int[] firstFivePositives=new int[]{1,5,3,4,55,4,5,6,7};
        System.out.println(firstFivePositives[2]);

        int [] firstFivePositives2={1,3,5,7,8};
        String []names={"Josh", "Aaron"};

        int newArray[];
        newArray=new int[5];
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println("-".repeat(15));
        System.out.println(Arrays.toString(newArray));
        String printed=Arrays.toString(newArray);
        System.out.println(printed);

        int[]firstArray=getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray); //növekvö sorrend
        System.out.println(Arrays.toString(firstArray));
        int[]secondArray=new int[10];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray, 5); //minden elemet 5-el tölt be
        System.out.println(Arrays.toString(secondArray));
        int [] thirdArray=getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[]fourthArray=Arrays.copyOf(thirdArray, thirdArray.length); //másolat
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        //csak ez van szortírozva, mert ez másolat, areferenc másra mutat, az eredeti Array
        //nem változik
        System.out.println(Arrays.toString(thirdArray));

        int[]smallerArray=Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int [] largerArray=Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray)); //az üres helyek 0-val lettek kitöltve

    String [] sArray={"Able", "Jane", "Mark", "Ralph", "David"};
    Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("Mark is on the list");
        }

        //Equality
        int [] s1={1,2,3,4,5,6};
        int [] s2={6,2,3,4,5,1};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len){
        Random random=new Random();
        int []newInt=new int[len];
       for(int i= 0; i<len; i++){
           newInt[i]= random.nextInt(100);

       }
       return newInt;
    }


}
