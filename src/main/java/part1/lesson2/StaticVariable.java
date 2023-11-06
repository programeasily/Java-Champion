package part1.lesson2;

/**
 * 1. Unlike instance variables, we can only have one copy of a static variable per class,
 *    irrespective of how many objects we create.
 * 2. Static variables are created at the start of program execution
 *    and destroyed automatically when execution ends.
 * 3. Initialization of a static variable is not mandatory.
 *    Its default value is 0.
 * 4. If we access a static variable like an instance variable (through an object),
 *    the compiler will show a warning message, which won’t halt the program.
 *    The compiler will replace the object name with the class name automatically.
 * 5. If we access a static variable without the class name,
 *    the compiler will automatically append the class name.
 */
public class StaticVariable {

    // 100 StaticVariable objects
    // obj1.name, obj2.name .... 100
    // StaticVariable.age = 30

    String name = "";

    // static variables are declared using the static keyword
    // within a class outside of any method, constructor or block
    static int age = 30;

}
