package exe_9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "A", "G", "G", "T", "F", "F", "D", "D", "V", "V", "A", "A");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, (a, b) -> Integer.sum(a, b)));
        System.out.println(map);
    }
}
