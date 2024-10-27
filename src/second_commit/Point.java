package second_commit;

public class Point {
    private float x;
    private float y;
    private float z;

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";

    }

    public static void main(String[] args) {
        Point Vektor = new Point(3.0f, 4.0f, 5.0f);

        System.out.println("X: " + Vektor.getX());
        System.out.println("Y: " + Vektor.getY());
        System.out.println("Z: " + Vektor.getZ());

        System.out.println(Vektor);
    }
}
