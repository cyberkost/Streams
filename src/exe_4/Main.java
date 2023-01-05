package exe_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        Map<Integer, List<String>> map = stream
                .collect(Collectors.groupingBy(e -> e.length()));

        List<String> list = map
                .entrySet()
                .stream()
                .max((o1, o2) -> o1.getKey() - o2.getKey())
                .map(e -> e.getValue())
                .get();
        System.out.println(list);
    }
}
