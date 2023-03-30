import java.util.Random;

public class WorksWithEnums {
    public static void main(String[] args) {
        Enumeration weekday = Enumeration.FRI;
        System.out.println(weekday);
        for (int i = 0; i < 10; i++) {
            weekday = getRandomDay();
            switchDayOfWeek(weekday);
//            System.out.printf("Name is %s, Ordinal Value= %d %n",
//                    weekday.name(), weekday.ordinal());
//            if (weekday == Enumeration.FRI) {
//                System.out.println("Found Friday");
//            }
        }
        for(Topping topping:Topping.values()){
            System.out.println(topping.name()+": "+topping.getPrice());
        }

    }

    public static Enumeration getRandomDay() {
        int random = new Random().nextInt(7);
        var alldays = Enumeration.values();
        return alldays[random];
    }


    public static void switchDayOfWeek(Enumeration weekday) {
        int weekdayInt=weekday.ordinal()+1;
        switch (weekday){
            case WED -> System.out.println("Wesnesday "+weekdayInt);
            case SAT -> System.out.println("Saturday "+weekdayInt);
            default -> System.out.println(weekday.name().charAt(0)+weekday.name().substring(1).toLowerCase()+"day is Day " + weekdayInt);

        }

    }
}