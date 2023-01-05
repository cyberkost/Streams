package exe_7;

public class Student {
    private String Name;
    private int Age;
    private int Course;

    public Student(String name, int age, int course) {
        Name = name;
        Age = age;
        Course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Student " +
                "Name = '" + Name + '\'' +
                ", Age = " + Age +
                ", Course = " + Course +
                ' ';
    }
}
