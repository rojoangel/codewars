public class PigLatin{

    public static final String WAY = "way";
    public static final String AY = "ay";
    public static final String AEIOU = "aeiou";

    public String translate(String str){
        if (containsNonAlpha(str)) {
            return null;
        }

        String lowerCase = str.toLowerCase();
        int firstVowelIndex = getFirstVowelIndex(lowerCase);
        switch (firstVowelIndex) {
            case -1:
                return lowerCase.concat(AY);
            case 0:
                return lowerCase.concat(WAY);
            default:
                return lowerCase.substring(firstVowelIndex)
                        .concat(lowerCase.substring(0, firstVowelIndex))
                        .concat(AY);
        }
    }

    /**
     * @param str the string to check for non-alpha chars
     * @return whether the passed string contains non-alpha chars
     */
    private boolean containsNonAlpha(String str) {
        boolean containsNonAlpha = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                containsNonAlpha = true;
                break;
            }
        }
        return containsNonAlpha;
    }

    /**
     * @param lowerCase lowercased string
     * @return first vowel index, -1 if not vowel is found
     */
    private int getFirstVowelIndex(String lowerCase) {
        int firstVowelIndex = -1;
        for (int i = 0; i < lowerCase.length(); i++) {
            if (AEIOU.indexOf(lowerCase.charAt(i)) >= 0) {
                firstVowelIndex = i;
                break;
            }
        }
        return firstVowelIndex;
    }
}