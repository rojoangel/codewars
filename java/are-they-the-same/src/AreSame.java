import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] sortedA = Arrays.stream(a).map(Math::abs).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        for (int i = 0; i < a.length; i++) {
            if (sortedA[i]*sortedA[i] != sortedB[i]) {
                return false;
            }
        }
        return true;
    }
}