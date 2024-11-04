package Information;

public class Football_player extends Player{
    private int CountOfRedCARD;
    private int CountOfYellowCARD;
    private int CountOfGoals;


    public Football_player(String nameOfPlayer, String sportType, int numberPosition, String teamName, int CountOfRedCARD,
         int CountOfYellowCARD, int CountOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.CountOfRedCARD = CountOfRedCARD;
        this.CountOfYellowCARD = CountOfYellowCARD;
        this.CountOfGoals = CountOfGoals;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Red Card: " + CountOfRedCARD + "\nYellow CARD: " + CountOfYellowCARD + "\nGoals: " + CountOfGoals);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        Football_player player = new Football_player("Ronaldo","Football",7, "Al-Nasir", 0, 0, 915);
        player.getInfo();
        player.getTeamName();
    }
}
