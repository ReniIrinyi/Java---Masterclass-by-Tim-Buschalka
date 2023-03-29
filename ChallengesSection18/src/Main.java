import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x=getIntBYL();
        System.out.println("x is "+x);
    }

    private static int getInt(){
        Scanner s=new Scanner(System.in);
        return s.nextInt();
    }

    private static int divideLBL(int x){
        try{
            return 10/x;
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private static int getIntBYL(){
        Scanner s=new Scanner(System.in);
        boolean isValid=true;
        System.out.println("Please enter an integer");
        String input=s.next();
        for(int i=0; i<input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }

            if (isValid) {
                return Integer.parseInt(input);
            }
        }
            return 0;

    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enrter");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }

    }
}