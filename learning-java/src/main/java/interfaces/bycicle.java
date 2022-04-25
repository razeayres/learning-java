package interfaces;

public interface bycicle {
    void changePedalRate(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBreaks(int decrement);
}
