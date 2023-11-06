package part1.lesson8;

public class StaticMethod {

    public static void main(String[] args) {
        staticM1();
    }

    static void staticM1() {
        staticM2();
    }

    static void staticM2() {
        System.out.println("Reached !");
    }
}
