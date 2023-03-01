import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items={"apples", "bananas", "milk", "cheese", "milk"};
        System.out.println(items);

        List<String>list=List.of(items); //return a list from string-array (factory method=> create a new instance of a class)
        System.out.println(list);
//        System.out.println(list.getClass().getName());
//        list.add("yoghurt");
        ArrayList<String> groceries=new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList=new ArrayList<>(
        List.of("prikcles", "mustard"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("This item= "+groceries.get(2));
        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }
        groceries.add("yogurt");
        System.out.println("first: "+ groceries.indexOf("yogurt"));
        System.out.println("last: "+groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        groceries.remove("mustard");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard")); //mindent törölni kivéve ezeket
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty= "+groceries.isEmpty());

        groceries.addAll(List.of("apples", "bananas", "milk", "mustad", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "prickles", "mustard", "ham")); //aslist  return array as arraylist!!
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray=groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
