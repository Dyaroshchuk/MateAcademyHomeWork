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
        char charInIndex = (char)values[index];
        return charInIndex;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int lenghtSubSequence = end - start;
        byte[] subSequenceArray = new byte[lenghtSubSequence];
        for (int i = 0; i < lenghtSubSequence; i++) {
            subSequenceArray[i] = values[start++];
        }
        AsciiCharSequence result = new AsciiCharSequence(subSequenceArray);
        return result;
    }

    @Override
    public String toString() {
        return new String(values);
    }
}

