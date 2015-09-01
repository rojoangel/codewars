public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Object[] rotatedData = new Object[data.length];
        int m = n % data.length;
        for (int i = 0; i < data.length; i++) {
            rotatedData[(i + m)  % data.length < 0 ? ((i + m) % data.length) + data.length : (i + m)  % data.length] = data[i];
        }
        return rotatedData;
    }

}