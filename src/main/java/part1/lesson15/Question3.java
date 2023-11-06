package part1.lesson15;

public class Question3 {

    String name;

    static String color;

    public static void main(String[] args) {

        Question3 obj1 = new Question3();
        obj1.name = "Prince";
        obj1.color = "Red";

        Question3 obj2 = new Question3();
        obj2.name = "Ram";
        obj2.color = "Green";

        System.out.println(obj1.name);
        System.out.println(obj1.color);

        System.out.println(obj2.name);
        System.out.println(obj2.color);

    }
}
