package task2;

public class Subwoofer extends Sounds{
    private int bassL;
    public Subwoofer(String brand, String model, int volumeL, int bassL) {
        super(brand, model, volumeL);
        this.bassL = bassL;
    }

    private int getBassL() {
        return bassL;
    }

    public void setBassL(int bassL) {
        this.bassL = bassL;
    }

    public void getInfoSubwoofer() {
        System.out.println("Bass Level: " + bassL);
    }

    public static void main(String[] args) {
        Subwoofer subwoofer = new Subwoofer("JBL", "W12GTI", 100,80);

        subwoofer.getInfo();
        subwoofer.getInfoSounds();
        subwoofer.getInfoSubwoofer();

        int b = 85;
        subwoofer.setBassL(b);
        System.out.println("Bass Level editing");

        subwoofer.getInfo();
        subwoofer.getInfoSounds();
        subwoofer.getInfoSubwoofer();
    }
}
