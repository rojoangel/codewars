public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        int sqrt = (int) Math.sqrt(8 * number + 1);
        return (sqrt * sqrt == 8 * number + 1);
    }
}
