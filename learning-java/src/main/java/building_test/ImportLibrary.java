package building_test;

import my_lib.math_utils; // importing the whole class
import static my_lib.math_utils.mult; // statically importing a method

public class ImportLibrary {
    public static void main(String[] args) {
        /*
        here we declare and
        define the variables
        a and b
        */
        double a = 4;
        double b = 25;

//        this to excecute our diffrent approaches
        class_approach(a, b);
        static_approach(a, b);
        class_approach2(a, b);
    }

//    this just used the imported static method
    public static void static_approach(double a, double b) {
        double result = mult(a, b); // calls the method 'mult'

        System.out.println(result);
    }

    /*
    this creates a class calc
    of type math_utils,
    and uses it method
    */
    public static void class_approach(double a, double b) {
        math_utils calc; // declares the object calc as type math_utils
        calc = new math_utils(); // defines the variable as a new object

        double result = calc.mult(a, b); // calls the method 'mult'

        System.out.println(result);
    }

    /*
    this is the same thing
    as the previous one,
    but here we do not
    have to declare and
    define the math_utils object
    */
    public static void class_approach2(double a, double b) {
        double result = math_utils.mult(a, b); // calls the method 'mult' directly by: class.method

        System.out.println(result);
    }
}
