import Geometric.Rectangle;
import Geometric.Trapezium;
import Geometric.Triangle;
import overridiing.Cat;
import overridiing.Dog;
import overridiing.Duck;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Animals");
        Dog dog = new Dog("Daisy");
        System.out.println("overridiing.Dog name: " + dog.getName());
        dog.sound();

        Cat cat = new Cat("Chloe");
        System.out.println("overridiing.Cat name: " + cat.getName());
        cat.sound();

        Duck duck = new Duck("Donald");
        System.out.println("overridiing.Duck name: " + duck.getName());
        duck.sound();

        System.out.println("\t GeometricFigure");

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Tirangle area: " + triangle.Area());
        System.out.println("Tirangle perimeter: " + triangle.perimeter() +"\n");

        Rectangle rectangle = new Rectangle(8, 15);
        System.out.println("Rectangle area: " + rectangle.Area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter() +"\n");

        Trapezium trapezium = new Trapezium(5, 15, 17);
        System.out.println("Trapezium area: " + trapezium.Area());
        System.out.println("Trapezium perimeter: " + trapezium.perimeter() +"\n");


    }
}