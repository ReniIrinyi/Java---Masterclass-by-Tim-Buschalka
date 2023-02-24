import java.util.Arrays;
import java.util.Scanner;

public class TagImmerNeunChallenge {
    public static void main(String[] args) {
        System.out.println("Bitte gebe dein Gebrutstag an!");
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String[] inputArray=input.replace(",","").split("");

        int [] newArray=new int[inputArray.length];
        int [] diffArray=new int[inputArray.length/2];

        for(int i=0; i<inputArray.length; i++){
            newArray[i]= Integer.parseInt(inputArray[i].trim());
        }
        int number=0;
        int counter=0;

        Arrays.sort(newArray);
        for(int j=0; j<diffArray.length; j++){
            diffArray[j]=(newArray[counter+1]-newArray[counter]);
            counter=counter+2;
            number+=diffArray[j];
        }

        System.out.println("Dein Geburtstag= " +Arrays.toString(inputArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(diffArray));
        System.out.printf("Dein Promi-Faktor ist= %s ", number);

    }

}
