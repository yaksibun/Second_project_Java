package Information;

public class GoalKeeper extends Football_player{
    private int GoalOfSaves;
    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int CountOfRedCARD, int CountOfYellowCARD, int CountOfGoals, int GoalOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName, CountOfRedCARD, CountOfYellowCARD, CountOfGoals);
        this.GoalOfSaves = GoalOfSaves;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Save Goals: " + GoalOfSaves);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        GoalKeeper keeper = new GoalKeeper("Thibaut Courtois", "Football", 25, "Real Madrid", 2, 4, 1, 102);
        keeper.getInfo();
        keeper.getTeamName();
    }
}
