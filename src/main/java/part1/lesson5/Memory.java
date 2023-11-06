package part1.lesson5;

import part1.lesson4.Bicycle;

public class Memory {

    public static void main(String[] args) {

        // Stored in Stack
        int localVar = 10;

        // obj1 ref stored in Stack
        // Bicycle object stored in Heap
        Bicycle obj1 = new Bicycle();
        obj1.speedUp(10);
        obj1.applyBrakes(5);

        Bicycle obj2 = new Bicycle();
        obj1.speedUp(100);
        obj1.applyBrakes(50);
    }

}
