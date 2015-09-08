public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; i < Math.log(n) / Math.log(2) + 1; i++) {
            for (int j = 2; Math.pow(j, i) <= n; j++) {
                if (Math.pow(j, i) == n) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }
}