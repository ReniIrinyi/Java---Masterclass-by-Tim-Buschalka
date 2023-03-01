import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    record GroceryItem(String name, String type, int count) {
        public GroceryItem(String name) {
            this(name, "Diary", 1);
        }

        @Override
        public String toString() {
            return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
    }

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("oranges", "Produces", 5);
        System.out.println(Arrays.toString(groceryArray));


        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yoghurt");

        ArrayList<GroceryItem> groceryList=new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Oranges"));
        groceryList.set(0,(new GroceryItem("Apples", "Produce", 5))); //replace the first index
        groceryList.remove(1); // remove index 1
        System.out.println(groceryList);

    }
}





