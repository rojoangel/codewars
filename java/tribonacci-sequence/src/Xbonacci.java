import java.math.BigInteger;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] result = initResult(s, n);
        for (int i = s.length; i < n; i++) {
            result[i] = result[i-1] + result[i-2] +result[i-3];
        }
        return result;
    }

    private double[] initResult(double[] s, int n) {
        double[] result = new double[n];
        for (int i = 0; i < s.length && i < n; i++) {
            result[i] = s[i];
        }
        return result;
    }
}