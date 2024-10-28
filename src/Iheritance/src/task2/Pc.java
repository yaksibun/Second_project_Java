package task2;

public class Pc extends Computers{
    private String graphCard;
    public Pc(String brand, String model, String cpu, int ram, String graphCard) {
        super(brand, model, cpu, ram);
        this.graphCard = graphCard;
    }

    public String getGraphCard() {
        return graphCard;
    }

    public void setGraphCard(String graphCard) {
        this.graphCard = graphCard;
    }

    public void getInfoGraphCard() {
        System.out.println("Graph Card: " + graphCard);
    }

    public static void main(String[] args) {
        Pc pc = new Pc("Asus", "S500TER","Intel Core I7 14th gen", 32, "RTX 3060");
        pc.getInfo();
        pc.getInfoComputers();
        pc.getInfoGraphCard();
    }
}
