package tasks_04_27_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m6();
        m5();
    }

    /**
     * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
     */
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        String substring = "Java";
        Long count = list.stream()
                .filter(s -> s.contains(substring))
                .count();
        System.out.println(count + " строки найдено, которые содержат подстроку " + substring);
    }

    /**
     * Дан список целых чисел. Необходимо найти максимальный
     * элемент списка, который делится на заданное число без остатка
     */

    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        Integer divisor = 5;
        Integer result = list.stream()
                .filter(n -> n % divisor == 0)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Максимальный элемент списка: " + result + ", который делится на число " + divisor + " без остатка");
    }

    /**
     * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
     * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву
     */

    public static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Anna", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Will", 40));
        double averageAgeOfPersons = people.stream()
                .filter(p -> p.getName().startsWith("J"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Средний возраст людей, чьи имена начинаются на букву J: " + averageAgeOfPersons);
    }

    /**
     * Дана коллекция строк. Необходимо найти все уникальные слова,
     * которые содержатся в этой коллекции строк, и вернуть их в виде списка
     */

    private static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language.");
        List<String> newLines = lines.stream()
                .flatMap(line -> Stream.of(line.split("[ .]")))
                .distinct()
                .toList();
        System.out.println("Все уникальные слова, которые содержатся в коллекции строк : " + newLines);
    }

    /**
     * Проверка корректности email адреса.REGEX
     */

    private static void m6() {
        String email = "example@example.com";
        String regex = "[\\w\\d._%+\\-]+@[\\w\\d.\\-]+\\.[\\w]{2,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email-адрес " + email + " корректный");
        } else {
            System.out.println("Email-адрес " + email + " некорректный");
        }
    }

    /**
     * Дан массив стрингов. Вывести на экран все буквы и кол-во их повторений во всем массиве
     */

    public static void m5() {
        String[] arr = {"apple", "banana", "apricot", "cherry", "kiwi"};
        Map<Character, Long> map = Arrays.stream(arr)
                .flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((ch, count) -> System.out.println(ch + ": " + count));
    }
}
