import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaExpression {
    record Person(String firdtName, String lastName){
        @Override
        public String toString() {
            return "Person{" +
                    "firdtName='" + firdtName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Person>people=new ArrayList<>(Arrays.asList(
                new Person("Luci", "Van Pelt"),
                new Person("Linus", "Titulus")));
        //anonymus class


    }
}
