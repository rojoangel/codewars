import java.math.BigDecimal;

public class Suite {

    public static double going(int n) {
//         return factorialSum(n) / factorial(n);
        BigDecimal bd = new BigDecimal(factorialSum(n) / factorial(n));
        bd = bd.setScale(6, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    public static double factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double factorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}