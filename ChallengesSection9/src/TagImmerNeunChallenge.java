import java.util.Arrays;

public class TagImmerNeunChallenge {
    public static void main(String[] args) {
    /*    System.out.println("Bitte gebe dein Geburtstag an!");
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String[] inputArray=input.replace(",","").split("");

        int [] newArray=new int[inputArray.length-1];
        int [] diffArray=new int[inputArray.length-1];

        for(int i=0; i<inputArray.length; i++){
            newArray[i]= Integer.parseInt(inputArray[i].trim());
        }
*/
        int[] newArray={0,5,1,9,9,9};
        int[] diffArray=new int[newArray.length-1];

        int number=0;
        Arrays.sort(newArray);
        for(int j=0; j<diffArray.length; j++){
            diffArray[j]=Math.abs(newArray[j+1]-newArray[j]);
            number+=diffArray[j];
        }

       // System.out.println("Dein Geburtstag= " +Arrays.toString(inputArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(diffArray));
        System.out.printf("Dein Promi-Faktor ist= %s ", number);

    }

}
