package Information;

public class Player implements Information{
    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public void getInfo() {
        System.out.println("Player\nNAME: " + nameOfPlayer + "\nSPORT TYPE: " + sportType + "\nPOSITION: " + numberPosition);
    }

    @Override
    public void getTeamName() {
        System.out.println("TEAM NAME: " + teamName);
    }

    public static void main(String[] args) {
        Information info = new Player("Jack", "Volleyball", 3, "Eagles");
        info.getInfo();
        info.getTeamName();
    }
}
