package home.work10.ascii;

public class Main {

    public static void main(String[] args) {
        byte[] someSentence = {73, 116, 39, 115, 32, 119, 97, 115, 32, 105, 110, 116,
                101, 114, 101, 115, 116, 105, 110, 103, 33};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(someSentence);

        System.out.println(asciiCharSequence.charAt(5));
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.subSequence(5, 8));
        System.out.println(asciiCharSequence);
    }
}
