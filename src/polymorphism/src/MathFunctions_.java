public class MathFunctions_ {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiplay(int a, int  b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int abs(int number) {
        if (number < 0) {
            return number * -1;
        }
        return number;
    }

    public int pow(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        MathFunctions_ mathFunctions = new MathFunctions_();
        System.out.println(mathFunctions.add(5, 8));
        System.out.println(mathFunctions.sub(5, 8));
        System.out.println(mathFunctions.multiplay(5, 8));
        System.out.println(mathFunctions.div(5, 8));
        System.out.println(mathFunctions.add(5, 8));
        System.out.println(mathFunctions.abs(-5));
        System.out.println(mathFunctions.pow(5));
    }
}
