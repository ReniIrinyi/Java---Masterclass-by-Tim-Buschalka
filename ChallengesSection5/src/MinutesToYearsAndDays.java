public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays ( long minutes){
        long year=((minutes/60)/24)/365;
        long day=((minutes/60)/24)%365;
        System.out.println(minutes < 0 ? "Invalid Value" : minutes +" min" + " = "+ year+" y and "+day+" d "  );
    }

}
