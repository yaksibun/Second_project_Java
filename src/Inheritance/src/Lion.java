public class Lion extends Cat {
    public void king() {
        System.out.println("KIng");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.run();
        lion.eat();
        lion.king();
    }
}
