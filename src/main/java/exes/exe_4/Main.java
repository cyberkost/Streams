package exes.exe_4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        Map<Integer, List<String>> map = stream
                .collect(Collectors.groupingBy(String::length));

        List<String> list = map
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .map(e -> e.getValue())
                .get();
        System.out.println(list);
    }


}
