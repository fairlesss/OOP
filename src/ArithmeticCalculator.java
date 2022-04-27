public class ArithmeticCalculator {
    private int num, den;

    public ArithmeticCalculator(int numerator, int denominator) {
        this.num = numerator;
        this.den = denominator;
    }

    public ArithmeticCalculator addition(ArithmeticCalculator a) {
        if (den == a.den) {
//          System.out.println(num + "/" + den + " + " + a.num + "/" + a.den + " = " + (num + a.num) + "/" + den);
            return new ArithmeticCalculator(num + a.num, den);
        } else {
            return new ArithmeticCalculator((num * a.den) + (a.num * den), den * a.den);
        }
    }

    public ArithmeticCalculator subtraction(ArithmeticCalculator b) {
        if (den == b.den) {
            return new ArithmeticCalculator(num - b.num, den);
        } else {
            return new ArithmeticCalculator((num * b.den) - (b.num * den), den * b.den);
        }
    }

    public ArithmeticCalculator multiplication(ArithmeticCalculator c) {
        return new ArithmeticCalculator(num * c.num, den * c.den);
    }

    public ArithmeticCalculator division(ArithmeticCalculator d) {
        return new ArithmeticCalculator(num * d.den, d.num * den);
    }

    public boolean comparison(ArithmeticCalculator e) {
        double number1 = num / den;
        double number2 = e.num / e.den;
        if (number1 > number2) {
            return number1 > number2;
        } else if (number2 < number2) {
            return number2 < number2;
        } else {
            return number1 == number2;
        }
    }
}
