package overridiing;

import overridiing.Animal;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " sound: Quack-quack" +"\n");
    }
}
