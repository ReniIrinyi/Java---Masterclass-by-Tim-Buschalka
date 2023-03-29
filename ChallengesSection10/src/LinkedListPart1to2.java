import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPart1to2 {
    public static void main(String[] args) {
        //LinkedList <String> placesToVisit=new LinkedList <>();
        var placeToVisit=new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);
        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        removeElements(placeToVisit);

        System.out.println("add more elements: ");
        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        gettingElements(placeToVisit);

        printItinerary(placeToVisit);
        printItinerary2(placeToVisit);
        printItinerary3(placeToVisit);

        testIterator(placeToVisit);
        testListIterator(placeToVisit);
    }

    private static void addMoreElements(LinkedList <String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offer("Budapest");
        list.offer("Rome");
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        //Stack methods
        list.push("Alice Springs");


    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
       String s1= list.remove();
        System.out.println(s1+" was removed");
        System.out.println(list);

        String s2= list.removeFirst();
        System.out.println(s2+" was removed");
        System.out.println(list);

        String s3= list.removeLast();
        System.out.println(s3+" was removed");
        System.out.println(list);

        String p1=list.poll();
        System.out.println(p1+" was removed");
        System.out.println(list);

        String p2=list.pollFirst();
        System.out.println(p2+" was removed");
        System.out.println(list);

        String p3=list.pollLast();
        System.out.println(p3+" was removed");
        System.out.println(list);
    }

    private static void gettingElements(LinkedList<String>list){
        System.out.println("Elements: "+list.get(4));
        System.out.println("Last :"+list.getLast());
        System.out.println("First: "+list.getFirst());
        System.out.println("Brisbane is on the position of: "+list.indexOf("Brisbane"));

        //Queu retrievel Method => FIFO first in first out
        System.out.println("Element from element()= "+list.element());

        //Stack terrieval methods
        System.out.println("Element from peek()= "+list.peek());
        System.out.println("Element from peekFirst()= "+list.peekFirst());
        System.out.println("Element from peekLast()= "+list.peekLast());
    }
public static void printItinerary(LinkedList<String>list){
    System.out.println("First: "+list.getFirst());
    for(int i=1; i<list.size(); i++){
        System.out.println("-->From "+list.get(i-1)+" to "+list.get(i));
    }
    System.out.println("Last: "+list.getLast());
}
    public static void printItinerary2(LinkedList<String>list){
        System.out.println("First: "+list.getFirst());
        String previousTown=list.getFirst();
        for(String town:list){
            System.out.println("--From "+ previousTown+ " to "+town);
            previousTown=town;
        }
        System.out.println("Last: "+list.getLast());
    }

    public static void printItinerary3(LinkedList<String>list){
        System.out.println("First: "+list.getFirst());
        String previousTown=list.getFirst();
        ListIterator<String> iterator=list.listIterator(1);
        while(iterator.hasNext()){
            var town=iterator.next();
            System.out.println("--From "+ previousTown+ " to "+town);
            previousTown=town;
        }
        System.out.println("Last: "+list.getLast());
    }

    public static void testIterator(LinkedList<String>list){
        //only remove method
        var iterator=list.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

    public static void testListIterator(LinkedList<String>list){
        // also remove, add and set methods
        var iterator=list.listIterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Hobart")){
                iterator.add("Luzern");
            }
        }
        //backward
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }
        System.out.println(list);

        var iterator2=list.listIterator(3);
        System.out.println(iterator2.previous());

    }

}
