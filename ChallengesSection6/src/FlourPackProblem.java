public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(3, 2, -12));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        if(bigCount>=0 && smallCount>=0 && goal>=0){
        if (goal > bigCount && goal % 5 == 0) {
            return true;
        } else if (goal<=bigCount + smallCount ) {
            if(bigCount%5==0){
                if (goal % 5 == 0 || goal %5 <=smallCount) {
                    return true;
                }
        } else if (goal <=smallCount || bigCount == goal) {
            return true;
            }
        }
        }
return false;
    };




}
