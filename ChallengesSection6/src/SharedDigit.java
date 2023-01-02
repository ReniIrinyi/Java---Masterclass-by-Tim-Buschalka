public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int nr1, int nr2) {
        boolean shared = false;
        if (nr1 > 9 && nr1 <= 99 && nr2 > 9 && nr2 <= 99) {
            for (int i = nr1; i != 0; i /= 10) {
                for (int j = nr2; j != 0; j /= 10) {
                    if (i % 10 == j % 10) {
                        shared = true;
                    }
                }
            }

        }
        return shared;
    }
}
