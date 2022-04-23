package geometry;

import java.util.Scanner;

public class square extends shape {
    Scanner in = new Scanner(System.in);

    public square() {
        super("square");
    }

    public square(String name) {
        super(name);
    }

    /*
    this is the only method that
    we changed in comparison
    to the circle class
    */
    public double calculateArea() {
        System.out.println("Enter the height of the square: ");
        double side = in.nextDouble();
        return Math.pow(side, 2);
    }
}
