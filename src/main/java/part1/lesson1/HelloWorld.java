package part1.lesson1;

// class
public class HelloWorld {

    // fields
    String msg = "Hello World !";

    // methods
    void method1() {
        // statements or instructions how it should perform
        System.out.println(msg);
    }

    // main method to start the java software application
    public static void main(String[] args) {
        // statements

        // objects
        final HelloWorld object =  new HelloWorld();
        object.method1();
    }
}
