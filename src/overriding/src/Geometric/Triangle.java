package Geometric;

public class Triangle extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double A, double B, double C) {
        this.sideA = A;
        this.sideB = B;
        this.sideC = C;
    }

    @Override
    public double Area() {
                double s = (sideA + sideB + sideC) / 2;
                return (s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
