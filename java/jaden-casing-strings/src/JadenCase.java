public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.length() == 0) {
            return null;
        }

        String[] words = phrase.split("[\\s]");
        StringBuffer jadenCasePhrase = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            jadenCasePhrase.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
            if (i < words.length - 1) {
                jadenCasePhrase.append(" ");
            }
        }
        return jadenCasePhrase.toString();
    }
}