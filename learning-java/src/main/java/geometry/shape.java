package geometry;

/*
this class is abstract
to make sure that all
classes the inherits
from this own have
their own method to
calculate their area
*/
public abstract class shape {
    /*
    by being abstract, it cannot
    be created directly, but it
    can be used as superclass for
    others to be inherited from
    */

    private String shapeName;
    private double area;

    /*
    these area possible
    constructors for
    the class shape
    */
    public shape() {
        shapeName = "shape";
        area = 0;
    }

    public shape(String name) {
        this.shapeName = name;
        area = 0;
    }

    public shape(String name, double area) {
        this.shapeName = name;
        this.area = area;
    }

    /*
    this is the main reason for
    the shape class to be abstract.
    It also forces the the classes that 
    inherits fromt this one to create
    their own calculateArea() method
    */
    public abstract double calculateArea();
//    this is not necessary to exist just because the class is abstract
//    it cannot hold implementation, it is just the header alone
}
