package task2;

public class Laptop extends Computers{
    private String batteryL;
    public Laptop(String brand, String model, String cpu, int ram, String batteryL) {
        super(brand, model, cpu, ram);
        this.batteryL = batteryL;
    }

    public String getBatterL() {
        return batteryL;
    }

    public void setBatterL(int batterL) {
        this.batteryL = batteryL;
    }

    public void getInfoBattery() {
        System.out.println("Battery Life: " + batteryL);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "Victus", "Intel I5 13400F", 16, "81%");
        laptop.getInfo();
        laptop.getInfoComputers();
        laptop.getInfoBattery();
    }
}
