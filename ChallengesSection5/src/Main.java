import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers:");

        int sum=0;
        int count=0;
        double avg=0;
        int even=0;
        int odd=0;

        while(true) {
            int userinput=Integer.valueOf(scanner.nextLine());
            if(userinput<0){break;}
            if (userinput > 0) {
                for (int i = userinput; i <= userinput; i++) {
                    sum += userinput;
                    count++;
                    avg = 1.0*sum / count;

                    if (i % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                };
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+avg);
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
        System.out.println("Numbers:"+count);
    }
}