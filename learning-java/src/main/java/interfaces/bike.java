package interfaces;

/*
this shows how we implement
a interface to create a class.
It requires two steps:
*/
public class bike implements bycicle { // <- (1) add "implements" followed by the interface
//    these are global variables
    int pedalRate = 0;
    int speed = 0;
    int gear = 1;

    @Override // <- (2) make sure to @Override all methods in the interface, creating your own
    public void changePedalRate(int newValue) {
        pedalRate = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println(" pedal rate: " +
        pedalRate + " speed: " +
        speed + " gear: " + gear);
    }
}
