public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean playing=false;
        if(summer && temperature >= 25 && temperature <= 45){
            playing=true;
        }else if(!summer){
            if(temperature <= 35 && temperature >= 25){
                playing=true;
            } else playing=false;
        }else playing=false;

        return playing;
    };

}
