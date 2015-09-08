import java.math.BigDecimal;
import java.math.BigInteger;

public class Suite {

    public static double going(int n) {
//         return factorialSum(n) / factorial(n);
        BigDecimal bd = factorialSum(n).divide(factorial(n), BigDecimal.ROUND_FLOOR);
        return bd.doubleValue();
    }

    public static BigDecimal factorial(int n) {
        BigDecimal fact = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigDecimal.valueOf(i));
        }
        return fact.setScale(6, BigDecimal.ROUND_UNNECESSARY);
    }

    public static BigDecimal factorialSum(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 1; i <= n; i++) {
            sum = sum.add(factorial(i));
        }
        return sum.setScale(6, BigDecimal.ROUND_UNNECESSARY);
    }
}