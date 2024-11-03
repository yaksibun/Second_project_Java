package overridiing;

import overridiing.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " sound: meow-meow" +"\n");
    }
}
