import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        List<String> numAsList = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            numAsList.add(i, String.valueOf(num).substring(i, i + 1));
        }
        Collections.sort(numAsList, Collections.reverseOrder());
        String numAsString = "";
        for (String digit : numAsList) {
            numAsString = numAsString.concat(digit);
        }
        return Integer.parseInt(numAsString);
    }
}
