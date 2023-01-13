public class Main {
    public static void main(String[] args) {


    }

    public static int findShort(String s){




           String strings [] =s.split(" ");
           String currS=strings[0];
           for(int i=0; i<strings.length; i++){
               if(strings[i].length() < currS.length()){
                   currS=strings[i];

               }


           }
        return currS.length();




    }


}