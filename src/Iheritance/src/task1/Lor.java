package task1;

public class Lor extends Doctor {

    private String type;

    public Lor(String name, int age, int salary, String type) {
        super(name, age, salary);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void type(){
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        Lor lor = new Lor("John", 25, 15000, "Lor");
        System.out.println(lor.specialty);
        lor.getInfo();
        lor.type();

    }
}
