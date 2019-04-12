package home.work8.intStream;

import java.util.stream.IntStream;

public class PseudoRandom {

    public static IntStream pseudoRandomStream(int seed) {
        if (seed < 0) {
            throw new IllegalArgumentException("seed can't bee less than 0");
        } else {
            return IntStream.iterate(seed, n -> n * n / 10 % 1000);
        }
    }
}
