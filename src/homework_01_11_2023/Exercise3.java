package homework_01_11_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Exercise3 {

    public static void main(String[] args) {
        lowerCaseFromFile();
        upperCaseFromFile();
    }

    private static void lowerCaseFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("book1984.txt"))) {
            long result = br.lines()
                    .map(String::toCharArray)
                    .map(arr -> {
                        ArrayList<Character> list = new ArrayList<Character>();
                        for (char c : arr) {
                            list.add(c);
                        }
                        return list;
                    })
                    .flatMap(Collection::stream)
                    .filter(Character::isLowerCase)
                    .count();

            System.out.printf("\nКоличество букв в нижнем регистре %d", result);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void upperCaseFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("book1984.txt"))) {
            long result = br.lines()
                    .map(String::toCharArray)
                    .map(arr -> {
                        ArrayList<Character> list = new ArrayList<Character>();
                        for (char c : arr) {
                            list.add(c);
                        }
                        return list;
                    })
                    .flatMap(Collection::stream)
                    .filter(Character::isUpperCase)
                    .count();

            System.out.printf("Количество букв в верхнем регистре %d", result);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
