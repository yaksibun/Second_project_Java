package task1;

public class Xirurg extends Doctor {

    private String type;
    public Xirurg(String name, int age, int salary, String type) {
        super(name, age, salary);
        this.type = type;
    }

    public void type() {
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Tom", 30, 30000, "Xirurg");
        System.out.println(xirurg.specialty);
        xirurg.getInfo();
        xirurg.type();
    }
}
