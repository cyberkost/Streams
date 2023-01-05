package exe_8;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.of(120, 410, 85, 32, 314, 12, 29, 60, 20, 19, 90, 77)
                .filter(x -> x > 50)
                .limit(7)
                .forEach(x1 -> System.out.println(x1));
    }
}
