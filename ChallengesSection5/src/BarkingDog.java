public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
        shouldWakeUp(true, 44);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
    boolean status=false;
        if(barking == false) {
            status = false;
        } else if (barking && hourOfDay>=0 && hourOfDay <=23) {
             if (hourOfDay < 8 || hourOfDay > 22) {
                status = true;
            } else if (hourOfDay < 0 || hourOfDay > 23) {
                 status = false;
             }

        }

        //System.out.println(status);
        return status;
    };
}
