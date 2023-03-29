import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place>placesToVisit=new LinkedList<>();
        Place adelaide= new Place("Adelaide", 1374);
        Place alice= new Place("Alice Springs", 2771);
        Place brisbane= new Place("Brisbane", 917);
        Place darwin= new Place("Darwin", 3972);
        Place melbourne= new Place("Melbourne", 877);

        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, alice);
        addPlace(placesToVisit, brisbane);
        addPlace(placesToVisit, darwin);
        addPlace(placesToVisit, melbourne);

        System.out.println(placesToVisit);
        printMenu(placesToVisit);
    }

private static void printMenu(LinkedList<Place> list) {
    boolean quitloop = false;
    boolean forward = true;
    var iterator = list.listIterator();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Available actions(select word or letter): \n" +
            "(F)orward\n" +
            "(B)ackwward\n" +
            "(L)ist Places\n" +
            "(M)enu\n" +
            "(Q)uit");
    while (!quitloop) {

        if (!iterator.hasNext()) {
            System.out.println("Final: "+iterator.previous());
            forward=false;
        }
        if (!iterator.hasPrevious()) {
            System.out.println("Originalting: "+iterator.next());
            forward=true;
        }

        System.out.print("Enter Value: ");
        String input = scanner.nextLine().toUpperCase().substring(0, 1);

        if (input.equalsIgnoreCase("Q")) {
            quitloop = true;
            break;
        }
            if (input.equalsIgnoreCase("F")) {
                if (iterator.hasNext()) {
                    Place place = iterator.next();
                    System.out.println("Moving  to " + place);
                    forward = false;
                }
            }
                if (input.equalsIgnoreCase("B")) {
                    if (iterator.hasPrevious()) {
                        Place place=iterator.previous();
                            System.out.println("Moving  to " + place);
                            forward = false;
                        }
                    }
                        if (input.equalsIgnoreCase("L")) {
                            listAllPlaces(list);
                            forward = false;
                        }
                        if (input.equalsIgnoreCase("M")) {
                            printMenu(list);
                            forward = false;
                        }
            }
        }
            private static void listAllPlaces (LinkedList < Place > list) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            private static void addPlace (LinkedList <Place> list, Place place){
                if (list.contains(place)) {
                    System.out.println("Found duplicate: " + place);
                    return;
                }
                for (Place p : list) {
                    if (p.getName().equalsIgnoreCase(place.getName())) {
                        System.out.println("Found duplicate: " + place);
                        return;
                    }
                }
                int matchedIndex = 0;
                for (var listPlace : list) {
                    if (place.getDistance() < listPlace.getDistance()) {
                        list.add(matchedIndex, place);
                        return;
                    }
                    matchedIndex++;
                }
                list.add(place);
        }
}



    class Place {
       private String name;
       private int distance;


        public Place(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        public int getDistance() {
            return distance;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }


