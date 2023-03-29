import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt=Integer.valueOf(15);
        Integer deprecatedBoxing=new Integer(15);
        int unboxedInt=boxedInt.intValue();

        //AUTO
        Integer autoBoxed=15;
        int autoUnboxed=autoBoxed;

        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName()); => mar nem object
            Double resulBoxed=getLiteralDoublePrimite();
            Double resultUnboxe=getdoubleobject();
        System.out.println(resulBoxed.getClass().getName());
        System.out.println(resultUnboxe.getClass().getName());

        getdoubleobject();

        Integer[]wrapper=new Integer[5];
        wrapper[0]=50;
        System.out.println(Arrays.toString(wrapper));

        System.out.println(wrapper[0].getClass().getName());

        Character[] charachter={'a', 'b', 'c'};
        System.out.println(Arrays.toString(charachter));

        //List.factory method=> List.of
        var ourList= List.of(1, 2, 3, 4);
        var ourList2=getListOfIntegers(1,2,3,4);
        System.out.println(ourList);
        System.out.println(ourList2);

    }
    private static ArrayList <Integer> getListOfIntegers(Integer... varargs){
        ArrayList<Integer>aList=new ArrayList<>();
        for(int i:varargs){
            aList.add(i);
        }
        return aList;
    }
    private static ArrayList <Integer> getlistOfInts(int... varargs){
        ArrayList<Integer>aList=new ArrayList<>();
        for(int i:varargs){
            aList.add(i);
        }
        return aList;
    }
        private static int returnAntInt(Integer i){
                return i;
        }

        public static Integer returnAnInteger(int i){
            return i;
        }



        private static Double getdoubleobject(){
                return Double.valueOf(100.000);
        }

        private static double getLiteralDoublePrimite(){
                return 100.00;
            }

}
