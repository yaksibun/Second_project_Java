package task2;

public class Sounds extends Electronics{
    private int volumeL;
    public Sounds(String brand, String model, int volumeL) {
        super(brand, model);
        this.volumeL = volumeL;
    }

    public int getVolumeL() {
        return volumeL;
    }

    public void setVolumeL(int volumeL) {
        this.volumeL = volumeL;
    }

    public void getInfoSounds() {
        System.out.println("Volume levl: " + volumeL);
    }
}
