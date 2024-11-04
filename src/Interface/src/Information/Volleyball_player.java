package Information;

public class Volleyball_player extends Player{
    private int numberOfPoints;
    public Volleyball_player(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Points: " + numberOfPoints);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        Volleyball_player player = new Volleyball_player("Maksim Mikhaylov", "Volleyball", 31,"Zenit Kazan", 9647);
        player.getInfo();
        player.getTeamName();
    }
}
