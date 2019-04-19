package home.work8.findMinMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        Comparator<Integer> comparator = Integer::compareTo;
        BiConsumer<Integer, Integer> biConsumer = ((o1, o2) -> System.out.println(o1 + " " + o2));

        Stream<Integer> stream = list.stream();

        MinMax.findMinMax(stream, comparator, biConsumer);

    }
}
