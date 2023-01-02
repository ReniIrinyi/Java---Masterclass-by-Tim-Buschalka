public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number > 2) {
            int max = 0;
            for (int i = 2; i < number; i++) {
                while (number % i == 0 ) {
                    max = i > max ? max = i : max;
                    break;
                }
            }
            return max;
        }
        return -1;
    }
}
