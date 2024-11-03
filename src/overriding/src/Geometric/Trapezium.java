package Geometric;

public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double A, double B, double high) {
        this.sideA = A;
        this.sideB = B;
        this.high = high;
    }

    @Override
    public double Area() {
        return ((sideA + sideB) / 2) * high;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + 2 *high;
    }
}
