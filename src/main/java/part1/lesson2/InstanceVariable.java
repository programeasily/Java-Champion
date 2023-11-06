package part1.lesson2;

/**
 * 1. As instance variables are declared in a class,
 *    these variables are created when an object of the class is created
 *    and destroyed when the object is destroyed.
 * 2. Unlike local variables, we may use access specifiers for instance variables.
 *    If we do not specify any access specifier, then the default access specifier will be used.
 * 3. Initialization of an instance variable is not mandatory. Its default value is 0.
 * 4. Instance variables can be accessed only by creating objects.
 */
public class InstanceVariable {

    // declared in a class outside any method, constructor, or block.
    int age = 30;


    void method1() {
        // can access here
        System.out.println(age);
    }


    void method2() {
        //can access here as well
        System.out.println(age);
    }
}
