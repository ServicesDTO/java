package S7;

public class Division implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return operand1 / operand2;
    }
}