import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int array[][]=new int[4][4];
        array[1]=new int[]{10,20,30}; // => 2. nested Array-nak teszi be az array-ban!
        System.out.println(Arrays.deepToString(array));

        Object[] anyArray=new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0]=new String[]{"a","b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1]=new String[][]{
                {"1", "2", "3"},
                {"1", "2"},
                { "1", "2"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2]=new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));


        for(Object element: anyArray){
            System.out.println("Element type= "+element.getClass().getSimpleName());
            System.out.println("Element toString() = "+element);
            System.out.println(Arrays.deepToString((Object[]) element));

        }
    }
}
