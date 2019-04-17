package home.work11.textCounter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TextCounter {

    // This method print 10 most popular words in input sentence
    public static void printMostPopularWord(String inputSentence) {
        String[] wordArray = inputSentence.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", " ").toLowerCase().split(" +");
        Arrays.stream(wordArray).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.<Map.Entry<String, Long>, Long>
                        comparing(Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(10)
                .forEach((x) -> System.out.println(x.getKey()));
    }
}
