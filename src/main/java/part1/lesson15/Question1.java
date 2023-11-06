package part1.lesson15;

public class Question1 {

    public static void main(String[] args) {
        Question1 question1 = null;
        new Question1().method1(question1);
    }

    void method1(Question1 question1) {
        question1.method2();
    }

    void method2() {
        System.out.println("Info Tech Tamil");
    }
}
