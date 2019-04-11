package home.work8.intStream;

import java.util.stream.IntStream;

public class PseudoRandom {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n * n / 10 % 1000); // your implementation here
    }
}
