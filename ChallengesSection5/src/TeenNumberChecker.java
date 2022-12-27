public class TeenNumberChecker {

    public static void main(String[] args) {

    }
    public static boolean hasTeen(int n1, int n2, int n3){
        return 13 <= n1 && n1 <= 19 || 13 <= n2 && n2 <= 19 || 13 <= n3 && n3 <= 19 ? true : false;
    };

    public static boolean isTeen(int n1){
        return n1 >=13 && n1<=19? true : false;
    }
}
