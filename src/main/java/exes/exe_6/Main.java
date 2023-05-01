package exes.exe_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {40, 51, 32, 11, 21, 24, 5, 7, 89, 86, 5, 4, 12, 20, 2, 6, 71, 100};

        Arrays.stream(numbers)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
    }
}
