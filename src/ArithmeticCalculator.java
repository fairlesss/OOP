public class ArithmeticCalculator {
    private double a;
    private double b;

    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void addition() {
        double res = a + b;
        System.out.println(a + " + " + b + " = " + res);
    }

    public void subtraction() {
        double res = a - b;
        System.out.println(a + " - " + b + " = " + res);
    }

    public void multiplication() {
        double res = a * b;
        System.out.println(a + " * " + b + " = " + res);
    }

    public void division() {
        double res = a / b;
        System.out.println(a + " / " + b + " = " + res);
    }

    public double comparison() {
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else
            System.out.println(a + " = " + b);
        return 0;
    }

    public static void main(String[] args) {
        ArithmeticCalculator calc = new ArithmeticCalculator(26.9, 12.7);
        calc.addition();
        calc.comparison();
        calc.division();
        calc.multiplication();
        calc.subtraction();
    }
}
