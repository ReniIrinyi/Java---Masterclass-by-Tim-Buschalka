import java.util.LinkedList;

public class LinkedListPart1 {
    public static void main(String[] args) {
        //LinkedList <String> placesToVisit=new LinkedList <>();
        var placeToVisit=new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);
        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        removeElements(placeToVisit);

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



}
