import java.util.*;

public class Keypad {


    private Map<String,Key> keyMap;

    public Keypad() {
        this.keyMap = new HashMap<>();
        initKeys();
    }

    private void initKeys() {
        addKey(new Key("1"));
        addKey(new Key("ABC2"));
        addKey(new Key("DEF3"));
        addKey(new Key("GHI4"));
        addKey(new Key("JKL5"));
        addKey(new Key("MNO6"));
        addKey(new Key("PQRS7"));
        addKey(new Key("TUV8"));
        addKey(new Key("WXYZ9"));
        addKey(new Key("*"));
        addKey(new Key(" 0"));
        addKey(new Key("#"));
    }

    private void addKey(Key key) {
        for (String s : key.getCharacters()) {
            this.keyMap.put(s, key);
        }
    }

    public static int presses(String phrase) {
        Keypad keypad = new Keypad();
        int tapCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            String currentCharacter = phrase.substring(i, i + 1);
            Key key = keypad.getKey(currentCharacter);
            do {
                tapCount++;
            } while (!key.tap().equals(currentCharacter));
            key.lockIn();
        }
        return tapCount;
    }

    private Key getKey(String character) {
        return keyMap.get(character);
    }

}

class Key {
    private final List<String> characters;
    private Iterator<String> charactersIterator;

    public Key(String label) {
        characters = new ArrayList<>(label.length());
        for (int i = 0; i < label.length(); i++) {
            characters.add(label.substring(i,i+1));
        }
    }

    public String tap() {
        if (charactersIterator == null) {
            charactersIterator = characters.iterator();

        }
        return charactersIterator.next();
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void lockIn() {
        charactersIterator = null;
    }
}
