public class Dog extends Animal{
    public void hunt() {
        System.out.println("Hunter");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.hunt();
    }
}
