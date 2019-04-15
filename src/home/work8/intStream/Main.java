package home.work8.intStream;

public class Main {

    public static void main(String[] args) {
        PseudoRandom.pseudoRandomStream(13).limit(30).forEach(System.out::println);
    }
}
