package part1.lesson9;

import java.util.Random;

public class UsageThis {

    int id;
    String name;

    UsageThis(String name) {
        // 1. this() can be used to invoke current class constructor.
        this();
        this.name = name;
    }

    UsageThis() {
        id = new Random().nextInt();
    }

    UsageThis getInstance() {
        // 2. this can be used to return the current class instance from the method.
        return this;
    }

    void m1() {
        // 3. this can be used to invoke current class method (implicitly).
        m2();

        // 4. this can be passed as argument in the constructor call.
        m3(this);
    }

    void m2() {
        // 5. this can be used to refer current class instance variable.
        System.out.println(name);
    }

    void m3(UsageThis obj) {

    }
}
