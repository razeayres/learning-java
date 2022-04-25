package interfaces;

/*
interfaces are like
templates for a type of class.
They ensure that a class of this
type will have all the required methods
*/
public interface bycicle {
    void changePedalRate(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBreaks(int decrement);
}
