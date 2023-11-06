package part1.lesson4;

/**
 * DESIGN OR BLUEPRINT OR TEMPLATE for Bi-Cycle
 */
public class Bicycle {
    /**
     * STATE -> FIELDS
     */
    int speed = 0;
    int gear = 1;
    /**
     * BEHAVIOUR -> METHODS
     */
    public void changeGear(int newValue) {
        gear = newValue;
    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println(" speed:" +
                speed + " gear:" + gear);
    }
}
