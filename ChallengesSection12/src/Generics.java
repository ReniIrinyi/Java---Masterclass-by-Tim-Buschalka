import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        BaseballTeam team1 = new BaseballTeam("Barca");
        team1.addTeamMember(new BaseballPlayer("Dudak", "01"));
        team1.addTeamMember(new BaseballPlayer("karcsi", "02"));
        team1.printTeamMembers();
        System.out.println(team1.toString());
    }
}

    record BaseballPlayer(String name, String position) {

    }

    class BaseballTeam {
        String teamName;
        private List<BaseballPlayer> teamMembers = new ArrayList<>();
        private int totalWins = 0, totalLosses = 0, totalTies = 0;

        public BaseballTeam(String teamName) {
            this.teamName = teamName;
        }

        public void addTeamMember(BaseballPlayer player) {
            if (!teamMembers.contains(player)) {
                teamMembers.add(player);
            }
        }

        public void printTeamMembers() {
            System.out.println(this.teamName);
            System.out.println(teamMembers);
        }


        public int ranking() {
            return (this.totalLosses + 2) + this.totalTies + 1;
        }

        public String getScore(int ourScore, int theirScore){
            String message="lost to ";
            if(ourScore>theirScore){
                totalWins++;
                message="beat";
            } else if(ourScore==theirScore){
                message="tied";
            } else {
                totalLosses++;
            }
            return message;
        }

        @Override
        public String toString() {
            return "BaseballTeam{" +
                    "teamName='" + teamName + '\'' +
                    "Ranked: "+ranking()+
                    ", teamMembers=" + teamMembers +
                    ", totalWins=" + totalWins +
                    ", totalLosses=" + totalLosses +
                    ", totalTies=" + totalTies +
                    '}';
        }
    }


