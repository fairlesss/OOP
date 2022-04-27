public class ArithmeticCalculator {
    private double number; 

    public ArithmeticCalculator(double number) {// Конструктор принимает на вхлд два числа : числитель и знаментатель
        this.number = number;
    }

    public ArithmeticCalculator addition(ArithmeticCalculator a) {//Хочется чтобы все таки была возможность складывать так:
    // 2/3+4/5 = 10/15+12/15 = 22/15 И возвращался объект имеено в таком виде. С отсальными методами такая же проблема
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
