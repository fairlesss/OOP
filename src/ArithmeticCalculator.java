public class ArithmeticCalculator {
    private double number;

    public ArithmeticCalculator(double number) {
        this.number = number;
    }

    public ArithmeticCalculator addition(ArithmeticCalculator a) {
        return new ArithmeticCalculator(number + a.number);
    }

    public ArithmeticCalculator subtraction(ArithmeticCalculator b) {
        return new ArithmeticCalculator(number - b.number);
    }

    public ArithmeticCalculator multiplication(ArithmeticCalculator c) {
        return new ArithmeticCalculator(number * c.number);
    }

    public ArithmeticCalculator division(ArithmeticCalculator d) {
        return new ArithmeticCalculator(number / d.number);
    }

    public boolean comparison(ArithmeticCalculator e) {
        if (number > e.number) {
            return number > e.number;
        } else if (number < e.number) {
            return number < e.number;
        } else
            return number == e.number;
    }
}
