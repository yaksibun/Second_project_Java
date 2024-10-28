package task2;

public class Computers extends Electronics{
    private String cpu;
    private int ram;

    public Computers(String brand, String model, String cpu, int ram) {
        super(brand, model);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void getInfoComputers() {
        System.out.println("CPU: " + cpu + "\nRAM: " + ram);
    }
}
