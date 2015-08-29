public class Reverse {

    public String reverse(String str) {
        return str.charAt(str.length() -1) + (str.length() > 1 ? reverse(str.substring(0, str.length() -1)) : "");
    }
}