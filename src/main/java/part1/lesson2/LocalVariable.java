package part1.lesson2;

public class LocalVariable {


    /**
     * 1. These variables are created when the block is entered,
     *    or the function is called and destroyed after exiting
     *    from the block or when the call returns from the function.
     * 2. The scope of these variables exists only within the block
     *    in which the variables are declared, i.e., we can access these variables only within that block.
     * 3. Initialization of the local variable is mandatory before using it in the defined scope.
     */
    void method1()
    {
        // A variable defined within a block or method
        // or constructor is called a local variable.
        int age = 30;

        System.out.println(age);
    }

    void m2() {
        System.out.println("");
    }
}
