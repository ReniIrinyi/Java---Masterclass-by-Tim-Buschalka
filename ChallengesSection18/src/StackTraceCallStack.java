import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StackTraceCallStack {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide());
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println("shot down");
            System.out.println(e.toString());
        }
    }


    public static int divide() {
        int x, y;
//        try {
            x = getint();
            y = getint();
            System.out.println("x is: " + x + " y is:" + y);
            return x / y;
//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage());
//            throw new NoSuchElementException(e.getMessage());
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException(e.getMessage());
        }





    public static int getint() {
        Scanner s = new Scanner(System.in);
        System.out.println("Give an integer");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("give an integer");
                s.nextLine();
            }
        }
    }
}