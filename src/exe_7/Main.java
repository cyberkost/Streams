package exe_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Uliana", 25, 2);
        Student st2 = new Student("Elina", 24, 4);
        Student st3 = new Student("Pavel", 27, 3);
        Student st4 = new Student("Alexander", 30, 2);
        Student st5 = new Student("Anatoli", 32, 1);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Map<Integer, List<Student>> map = list.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                }).collect(Collectors.groupingBy(student1 -> student1.getCourse()));
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
