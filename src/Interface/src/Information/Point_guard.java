package Information;

public class Point_guard extends Volleyball_player{
    private int countOfGurad;
    public Point_guard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfGurad) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfGurad = countOfGurad;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Guard: " + countOfGurad);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        Point_guard guard = new Point_guard("Gilgeous-Alexan", "Basketball",2, "Okhloma City Thunder", 47, 237);
        guard.getInfo();
        guard.getTeamName();
    }
}
