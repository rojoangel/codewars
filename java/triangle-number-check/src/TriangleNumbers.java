public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        long sqrt = (long) Math.sqrt(8 * number + 1);
        return (sqrt * sqrt == 8 * number + 1);
    }
}
