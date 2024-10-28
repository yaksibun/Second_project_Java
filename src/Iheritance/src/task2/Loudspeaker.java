package task2;

public class Loudspeaker extends Sounds{
    private int trebleL;
    public Loudspeaker(String brand, String model, int volumeL, int trebleL) {
        super(brand, model, volumeL);
        this.trebleL = trebleL;
    }

    public int getTrebleL() {
        return trebleL;
    }

    public void setTrebleL(int trebleL) {
        this.trebleL = trebleL;
    }

    public void getInfoLoudspeaker() {
        System.out.println("Treble level: " + trebleL);
    }

    public static void main(String[] args) {
        Loudspeaker loudspeaker = new Loudspeaker("JBL", "Flip 6", 80, 50);
        loudspeaker.getInfo();
        loudspeaker.getInfoSounds();
        loudspeaker.getInfoLoudspeaker();
    }
}
