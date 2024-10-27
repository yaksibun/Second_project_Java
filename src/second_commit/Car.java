package second_commit;

public class Car {
    private String model;
    private String color;
    private int price;
    private String manage;

    public Car(String model, String color, int price, String manage) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.manage = manage;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getManage() {
        return manage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }

    public void getInfo() {
        System.out.println("Model: " + model + "\nColor: " + color + "\nPrice: " + price + "\nManagement: " + manage);
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW X5", "Tiffany blue", 25000, "Auto");
        bmw.getInfo();

        bmw.setColor("Black");
        System.out.println("Updated Color: " + bmw.getColor());
    }
}
