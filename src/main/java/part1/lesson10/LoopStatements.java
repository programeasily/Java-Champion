package part1.lesson10;

public class LoopStatements {

    public static void main(String[] args) {
        whileLoop();
        doWhile();
        forLoop();
    }

    static void whileLoop() {
        int number = 0;
        while (number < 5) {
            System.out.println("while loop : " + number);
            number = number + 1;
        }
    }

    static void infiniteWhile () {
        while (true) {
            System.out.println("infinite");
        }
    }

    static void doWhile() {
        int number = 0;
        do {
            System.out.println("do while : " + number);
            number = number + 1;
        } while (number < 5);
    }

    static void forLoop() {
        for (int number = 0; number < 5 ; number = number+1) {
            System.out.println("for loop : " + number);
        }
     }

    static void infiniteLoop() {
        int number = 0;
        for (;;) {
            System.out.println("for loop : " + number);
        }
    }
}
