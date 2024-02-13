package S7;

public class Division implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return operand1 / operand2;
    }

    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        
        
        if (a.length != b.length){
           int[] c = new int[]{0};
          return c;
        }
        else {
            int[]  c = new int[a.length];
            for (int i = 0;i < a.length;i++){
                c[i]= a[i] / b[i];
            }
            return c;
        }
         
         
      }
}