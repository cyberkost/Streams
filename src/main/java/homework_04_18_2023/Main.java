package homework_04_18_2023;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem Lorem lorem lorem ipsum dolor sit amet, bebeto consectetur consectetur adipiscing elit. " +
                "Integer eu feugiat tellus. Nam molestie dolor diam sed libero egestas pellentesque. " +
                "Nulla. Looorem ipsum dolor sit amet, dolor consectetur adipiscing elit dolor. " +
                "Integer eu feugiat tellus. Nam dolor molestie diam sed libero egestas Pellentesque, pellentesque. pellentesque  " +
                "Nulla.";
        String[] words = text.split("\\s+");
        long uniqueWords = Arrays.stream(words).distinct().count();
        System.out.println("Unique words in text: " + uniqueWords);
        Map<String, Long> wordCounts = Arrays.stream(words)
                .map(w -> w.replaceAll("[^a-zA-Z]", "").toLowerCase())
                .filter(w -> w.length() > 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Words in text: " + words.length);
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
