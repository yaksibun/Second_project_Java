package Information;

public class Setter extends Volleyball_player{
    private int countOfSets;
    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Sets: " + countOfSets);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        Setter setter = new Setter("Maksim Mikhaylov", "Volleyball", 31,"Zenit Kazan", 9647, 130);
        setter.getInfo();
        setter.getTeamName();
    }
}
