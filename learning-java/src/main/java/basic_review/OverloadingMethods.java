package basic_review;

import java.util.*;

public class OverloadingMethods {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        this shows how the same method are being called multiple times differently
        feedback_to_user(5);
        feedback_to_user(5, 5);

        String text = feedback_to_user("Some text");
        System.out.println(text);
    }

    /*
    these are called overloading methods.
    As long as the return type or the inputs
    type and quantity are different, they act as
    different methods, although they have the same
    name
    */
    public static void feedback_to_user(double single_value) { // this one receives one double value and returns void
        System.out.println(single_value);
    }

    public static void feedback_to_user(double value1, double value2) { // this one receives two double value and returns void
        double single_value;
        single_value = value1 * value2;
        System.out.println(single_value);
    }

    public static String feedback_to_user(String text) { // this one receives one string value and returns string
        return text;
    }
}
