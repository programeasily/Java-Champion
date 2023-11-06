package part1.lesson6;

public class ParaConstructor {

    public static void main(String[] args) {
        ParaStudent paraStudent = new ParaStudent("prince", 29);
        System.out.println(paraStudent.name);
    }
}

class ParaStudent {
    String name;
    int age;

    ParaStudent() {

    }

    ParaStudent(String name) {
        this(name, 99); // chaining
    }

    // Parameterized Constructor
    ParaStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
