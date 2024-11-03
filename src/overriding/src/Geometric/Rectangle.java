package Geometric;

public class Rectangle extends GeometricFigure{
    private double sideA;
    private double sideB;

    public Rectangle(double A, double B) {
        this.sideA = A;
        this.sideB = B;
    }

    @Override
    public double Area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) * 2;
    }
}
