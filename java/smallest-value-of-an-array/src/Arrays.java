public class Arrays {

    public static final String INDEX = "index";
    public static final String VALUE = "value";

    public static int findSmallest(int[] ints, String index) {

        validateParams(ints, index);

        int smallestIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < ints[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return INDEX.equals(index) ? smallestIndex : ints[smallestIndex];
    }

    private static void validateParams(int[] ints, String index) {
        if (ints == null) {
            throw new IllegalArgumentException("ints argument cannot be null.");
        }

        if (ints.length == 0) {
            throw new IllegalArgumentException("ints argument cannot be empty");
        }

        if (!(INDEX.equals(index) || VALUE.equals(index))) {
            throw new IllegalArgumentException("index argument has to be 'index' or 'value'");
        }
    }
}
