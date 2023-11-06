package part1.lesson15;

public class Question2 {

    int id;
    String name;

    public static void main(String[] args) {

        Question2 obj = new Question2();
        int number = 5;

        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(number);

        obj.id = 1;
        obj.name = "a";
        number = 7;

        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(number);

        method1(obj, number);

        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(number);

    }

    static void method1(Question2 obj, int number) {
        obj.id = 2;
        obj.name = "b";
        number = 10;

        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(number);
    }
}
