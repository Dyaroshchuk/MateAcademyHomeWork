package home.work8.findMinMax;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> streamList = stream.sorted(order).collect(Collectors.toList());

        if (streamList.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(streamList.get(0), streamList.get(streamList.size() - 1));
        }
    }
}
