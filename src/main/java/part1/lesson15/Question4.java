package part1.lesson15;

public class Question4 {

    String name  = "Prince";

    public static void main(String[] args) {
        Question4 obj1 = new Question4();
        obj1.name = "Ram";
        obj1.print();
    }

    void print() {
        System.out.println(this.name);
    }
}
