package task;

public class Math_Function {
    static double pi;
    static double e;

    public Math_Function() {

    }

    public Math_Function(double pi, double e) {
        this.pi = pi;
        this.e = e;
    }

    public static double circleArea(double r) {
        return pi * (r * r);
    }

//  sinab ko'rish uchun static qilmay ketdim
    public double incr_e(double num) {
        return Math.pow(e,num);
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Math_Function mf = new Math_Function(3.14159265359, 2.71828182846);

        double r = 5;
        System.out.println("Doirani yuzi: " + Math_Function.circleArea(r));

//      agar method static bo'lmasa
        double num = 4;
        System.out.println(Math_Function.e + " ning " + num + "darajasi: " + mf.incr_e(num));

        int a = 5, b = 8, c = 12;
        System.out.println("Uchburchakni yuzi: " + Math_Function.triangleArea(a, b, c));

    }
}
