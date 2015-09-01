public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Object[] rotatedData = new Object[data.length];
        for (int i = 0; i < data.length; i++) {
            rotatedData[(i + n % data.length + data.length) % data.length] = data[i];
        }
        return rotatedData;
    }
}