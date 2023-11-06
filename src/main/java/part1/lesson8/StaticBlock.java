package part1.lesson8;

public class StaticBlock {

    static {
        System.out.println("Static block called");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
    }
}
