package exe_5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I");
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I");
        List<String> reverseList = list1.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseList);
    }

}
