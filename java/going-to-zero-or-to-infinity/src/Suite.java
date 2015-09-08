import java.math.BigDecimal;

public class Suite {

    public static double going(int n) {
        BigDecimal fact = BigDecimal.ONE.setScale(6, BigDecimal.ROUND_UNNECESSARY);
        BigDecimal sum = BigDecimal.ZERO.setScale(6, BigDecimal.ROUND_UNNECESSARY);
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigDecimal.valueOf(i));
            sum = sum.add(fact);
        }

        BigDecimal bd = sum.divide(fact, BigDecimal.ROUND_FLOOR);
        return bd.doubleValue();
    }
}