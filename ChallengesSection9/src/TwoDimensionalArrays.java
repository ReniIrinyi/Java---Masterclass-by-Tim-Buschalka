import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array2=new int[4][4];
        System.out.println(Arrays.toString(array2));
        for(int[]outer:array2){
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("-".repeat(15));
        for(int i = 0; i<array2.length; i++){
            var innerArray= array2[i];
            for(int j=0; j<innerArray.length; j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println(" "); //next line
        }
        System.out.println("-".repeat(15));

        for(var outer:array2){
            for(var element:outer){
                System.out.print(element+" ");
            }
            System.out.println(" "); //next line
        }
        System.out.println("-".repeat(15));

        System.out.println(Arrays.deepToString(array2));

        System.out.println("-".repeat(15));

        for(int i = 0; i<array2.length; i++){
            var innerArray= array2[i];
            for(int j=0; j<innerArray.length; j++){
               array2[i][j]=(i*10)+(j+1);
                System.out.print(array2[i][j]+" ");
            }
            System.out.println(" "); //next line
        }
        System.out.println("-".repeat(15));

    }
}
