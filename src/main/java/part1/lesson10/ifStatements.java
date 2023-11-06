package part1.lesson10;

public class ifStatements {
    public static void main(String[] args) {

        // Simple If Statements
        boolean condition = true; // or false
        if (condition) {
            System.out.println("Simple If Statements");
        }

        // if-else statement
        if (condition) {
            System.out.println("if-else statement : condition true");
        } else {
            System.out.println("if-else statement : condition false");
        }

        // if-else-if ladder
        condition = false;
        boolean condition2 = true;
        if (condition) {
            System.out.println("if-else-if ladder : condition true");
        } else if (condition2) {
            System.out.println("if-else-if ladder : condition2 true");
        }
        //...
        else {
            System.out.println("if-else-if ladder : all conditions are false");
        }

    }
}
