package Information;

public class Basketball_player extends Player{
    private int numberOfGoals;
    public Basketball_player(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Goals: " + numberOfGoals);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        Basketball_player player = new Basketball_player("Precious-Achiuwa", "Basketball",5, "New York Knicks", 500);
        player.getInfo();
        player.getTeamName();
    }
}
