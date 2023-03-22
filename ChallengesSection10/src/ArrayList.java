import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        String[] items={"apples", "bananas", "milk", "cheese", "milk"};
        //Method in Array-Class fort sort
        //ascending order
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));

        List<String> list=List.of(items);
        java.util.ArrayList<String> groceries=new java.util.ArrayList<>(list);

        //Methods in Array-List for sort
        //ascending order
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        //Descending order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);



    }
}
