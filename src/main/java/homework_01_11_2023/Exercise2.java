package homework_01_11_2023;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {

        Map<String, Long> wordsMap;
        try {
            wordsMap = Files.lines(Paths.get("book1984.txt"))
                    .flatMap(l -> Stream.of(l.split("\\s+")))
                    .map(word -> word.replaceAll("[^A-Яа-яЁё]+", "").toLowerCase())
                    .filter(word -> word.length() > 3)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            wordsMap.forEach((a, b) -> System.out.println(a + " : " + b));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
