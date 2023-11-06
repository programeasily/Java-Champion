package part1.lesson4;

public class CreateObject {

    public static void main(String[] args) {
        new CreateObject().create();
    }

    void create() {

        // n number of objects for the Bicycle class
        // each will have its own states and behaviour
        Bicycle tn14L0001 = new Bicycle();
        Bicycle tn14L0002 = new Bicycle();
        // ...
        Bicycle tn14L000n = new Bicycle();

        tn14L0001.changeGear(1);
        tn14L0001.speedUp(10);
        tn14L0001.applyBrakes(5);
        tn14L0001.printStates();
    }
}
