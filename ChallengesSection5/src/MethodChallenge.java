public class MethodChallenge {
    public static void main(String[] args) {
        int score1=HighScorePosition(1500);
        int score2=HighScorePosition(1000);
        int score3=HighScorePosition(500);
        int score4=HighScorePosition(200);
        int score5=HighScorePosition(50);

        displayHighScorePosition("Joe", score1);
        displayHighScorePosition("Joe", score2);
        displayHighScorePosition("Joe", score3);
        displayHighScorePosition("Joe", score4);
        displayHighScorePosition("Joe", score5);
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score list");
    };
    public static int HighScorePosition(int score){
        int position=4;
        if (score >= 1000){
            position= 1;
        } else if (score >= 500){
            position= 2;
        } else if(score > 100){
            position= 3;
        }
            return position;

    };
}
