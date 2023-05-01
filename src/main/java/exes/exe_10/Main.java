package exes.exe_10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String str = "otiwuklf";
        char ch = 'l';

        List<Integer> index = IntStream
                .iterate(str.indexOf(ch), i -> i != -1,
                        i -> str.indexOf(ch, i + 1))
                .boxed().collect(Collectors.toList());
        System.out.println(index);
    }
}
