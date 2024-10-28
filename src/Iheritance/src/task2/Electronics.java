package task2;

public class Electronics {
   private String brand;
   private String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

}
