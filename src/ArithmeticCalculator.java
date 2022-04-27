public class ArithmeticCalculator {
    private int numerator, denominator;

    public ArithmeticCalculator(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public ArithmeticCalculator addition(ArithmeticCalculator a) {
        if (denominator == a.denominator) {
//            System.out.println(numerator + "/" + denominator + " + " + a.numerator + "/" + a.denominator +
//                    " = " + (numerator + a.numerator) + "/" + denominator);
            return new ArithmeticCalculator(numerator + a.numerator, denominator);
        } else {// Вы уверены что так правильно приводить к общему знаменталю?
            return new ArithmeticCalculator(numerator + a.numerator, denominator * a.denominator);
        }
    }

    public ArithmeticCalculator subtraction(ArithmeticCalculator b) {
        if (denominator == b.denominator) {
            return new ArithmeticCalculator(numerator - b.numerator, denominator);
        } else {
            return new ArithmeticCalculator(numerator - b.numerator, denominator * b.denominator);
        }
    }

    public ArithmeticCalculator multiplication(ArithmeticCalculator c) {
        return new ArithmeticCalculator(numerator * c.numerator, denominator * c.denominator);
    }

    public ArithmeticCalculator division(ArithmeticCalculator d) {
        return new ArithmeticCalculator(numerator * d.denominator, d.numerator * denominator);
    }

    public boolean comparison(ArithmeticCalculator e) {
        double number1 = numerator / denominator;
        double number2 = e.numerator / e.denominator;
        if (number1 > number2) {
            return number1 > number2;
        } else if (number2 < number2) {
            return number2 < number2;
        } else {
            return number1 == number2;
        }
    }
}
