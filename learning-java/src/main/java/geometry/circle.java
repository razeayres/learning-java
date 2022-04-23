package geometry;

import java.util.Scanner;

/*
this 'extends' makes
the inheritance to work
*/
public class circle extends shape { // shape becomes super in this class
    Scanner in = new Scanner(System.in);

    public circle() {
        super("circle");    // it is the same as shape("circle")
    }

    public circle(String name) {
        super(name);
    }

    public double calculateArea() {
        System.out.println("Enter the radius of the circle: ");
        double radius = in.nextDouble();
        return Math.PI * Math.pow(radius, 2);
    }
}
