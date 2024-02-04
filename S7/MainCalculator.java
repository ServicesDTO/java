package S7;
public class MainCalculator implements Calculator {
    private final Operation operation;

    public MainCalculator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public double calculate(double operand1, double operand2) {
        double result = operation.execute(operand1, operand2);
        Logger.addLog(operand1,operand2,result,getOperationSymbol());
        return result;
    }

    private String getOperationSymbol() {
        if (operation instanceof Addition) {
            return "+";
        } else if (operation instanceof Multiplication) {
            return "*";
        } else if (operation instanceof Division) {
            return "/";
        } else {
            return "?";
        }
    }
}