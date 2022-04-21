package building_test;

import my_lib.math_utils; // importing the whole class
import static my_lib.math_utils.mult; // statically importing a method

public class ImportLibrary {
    public static void main(String[] args) {
        class_approach();
        static_approach();
    }

    public static void static_approach() {
        double a = 4;
        double b = 25;

        double result = mult(a, b);

        System.out.println(result);
    }

    public static void class_approach() {
        double a = 4;
        double b = 25;

        math_utils calc;
        calc = new math_utils();

        double result = calc.mult(a, b);

        System.out.println(result);
    }
}
