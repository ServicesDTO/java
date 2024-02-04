package S7;

public class Main {
    public static void main(String[] args) {
        //  сложение
        Calculator additionCalculator = new MainCalculator(new Addition());
        double resultAddition = additionCalculator.calculate(5, 3);
        System.out.println("Результат сложения: " + resultAddition);

        // вычитание
        Calculator minusCalculator = new MainCalculator(new Minus());
        double resultCalculator = minusCalculator.calculate(6, 2);
        System.out.println("Результат вычитания: " + resultCalculator);
     
        // умножение
        Calculator multiplicationCalculator = new MainCalculator(new Multiplication());
        double resultMultiplication = multiplicationCalculator.calculate(5, 3);
        System.out.println("Результат умножения: " + resultMultiplication);

        // деление
        Calculator divisionCalculator = new MainCalculator(new Division());
        double resultDivision = divisionCalculator.calculate(6, 2);
        System.out.println("Результат деления: " + resultDivision);
        
        Logger.printLog();


    }
}
