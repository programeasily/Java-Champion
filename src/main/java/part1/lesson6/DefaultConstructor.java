package part1.lesson6;

public class DefaultConstructor {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.age);
    }
}


class Student {
    String name;
    int age;

    Student() {
        // super();
    }
}
