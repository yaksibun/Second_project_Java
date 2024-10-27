public class Cat extends Animal{
    public void eat() {
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}
