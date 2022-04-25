package interfaces;

public class demo {
    public static void main(String[] args) {
        bike Raze = new bike();
        Raze.printStates();
        Raze.changePedalRate(2);
        Raze.speedUp(5);
        Raze.changeGear(1);
        System.out.println("\nAfter updating info: ");
        Raze.printStates();
    }
}
