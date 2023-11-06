package part1.lesson3;

public class CallStack {

    public static void main(String[] args) {
        new CallStack().m1();

        m3static();
    }

    void m1() {
        m2();
        m3static();
    }

    static void m3static() {

    }

    void m2() {
        m3();
    }

    void m3() {
        System.out.println("Reached !");
    }
}
