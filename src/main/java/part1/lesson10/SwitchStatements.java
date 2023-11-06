package part1.lesson10;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println(method(1));
    }

    static String method (int number){
        String result;
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            default:
                result = "none";

        }
        return result;
    }
}
