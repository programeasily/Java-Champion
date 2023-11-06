package part1.lesson8;

public class StaticVar {

    String name;
    int age;

    static String uniformColor = "green";

    public static void main(String[] args) {
        StaticVar obj1 = new StaticVar();
        obj1.name = "prince";
        obj1.age= 29;

        obj1.print();

        StaticVar obj2 = new StaticVar();
        obj2.name = "ram";
        obj2.age= 30;
        obj2.uniformColor = "red";

        obj2.print();
        obj1.print();
    }

    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(uniformColor);
    }
}
