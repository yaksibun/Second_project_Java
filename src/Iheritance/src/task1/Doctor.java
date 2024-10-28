package task1;

public class Doctor {

    String specialty = "Doctor";
    private String name;
    private int age;
    private int salary;
    public Doctor(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
    }
}
