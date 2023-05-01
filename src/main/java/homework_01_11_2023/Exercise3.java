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
        countLettersLoop();
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
            System.out.println(e);
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

            System.out.printf("\nКоличество букв в верхнем регистре %d", result);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void countLettersLoop() {
        try (BufferedReader br = new BufferedReader(new FileReader("book1984.txt"))) {
            long upperCount = 0;
            long lowerCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                for (Character c : line.toCharArray()) {
                    if (Character.isLetter(c) && Character.isUpperCase(c)) {
                        upperCount++;
                    } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                        lowerCount++;
                    }
                }
            }

            System.out.printf("\nUppers: %d, lowers: %d\n", upperCount, lowerCount);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
