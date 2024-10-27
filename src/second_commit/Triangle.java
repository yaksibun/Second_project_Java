package second_commit;

public class Triangle {
    private int a;
    private double b;
    private long c;

    public Triangle(int a, double b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public long getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(long c) {
        this.c = c;
    }

    public void getPerimeter() {
        double P = a + b + c;
        System.out.println("Perimeter of the triangle = " + P);
    }

    public void getArea() {
        double S = 0.5 * a * b;
        System.out.println("Area of the triangle = " + S);
    }

    public static void main(String[] args) {
        Triangle rightTriangle = new Triangle(15, 20.5, 25L);
        rightTriangle.getPerimeter();
        rightTriangle.getArea();

        rightTriangle.setA(20);
        System.out.println("Updated a: " + rightTriangle.getA());
    }
}
