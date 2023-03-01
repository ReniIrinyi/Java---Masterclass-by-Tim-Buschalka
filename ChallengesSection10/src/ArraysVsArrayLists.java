import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysVsArrayLists {
    public static void main(String[] args) {

        // transform array to a list
        String [] originalArray=new String[]{"First", "Second", "Third"};
        var originalList= Arrays.asList(originalArray);
        originalList.set(0, "one");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));
        //ha változtatjuk a listet amit az eredeti arrayból kreálunk az eredeti arrayt is meg fogja változtatni
        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: "+Arrays.toString(originalArray));

        //ennek vannak limitásai: nem lehet hozzádani vagy elvenni az elementbekböl!!

        List<String> newList=Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

    }
}
