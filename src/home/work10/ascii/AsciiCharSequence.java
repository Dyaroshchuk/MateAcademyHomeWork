package home.work10.ascii;

public class AsciiCharSequence implements CharSequence {
    private final byte[] values;

    public AsciiCharSequence(byte[] values) {
        this.values = values;
    }

    @Override
    public int length() {
        return values.length;
    }

    @Override
    public char charAt(int index) {
        return (char)values[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int lenghtSubSequence = end - start;
        byte[] subSequenceArray = new byte[lenghtSubSequence];
        for (int i = 0; i < lenghtSubSequence; i++) {
            subSequenceArray[i] = values[start++];
        }
        return new AsciiCharSequence(subSequenceArray);
    }

    @Override
    public String toString() {
        return new String(values);
    }
}

