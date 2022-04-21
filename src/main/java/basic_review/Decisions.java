package basic_review;

import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
        /*
         * this starts the scanner of
         * the inputs in
         * the command line
         * the stream is stored in the
         * variable "in"
         */
        Scanner in = new Scanner(System.in);

        /*
         * this prints out the
         * instruction to enter
         * the age of the user
         */
        System.out.println("Enter your age: ");

        /*
         * this actually stores
         * the age in a variable age,
         * while evaluating if it is an
         * integer
         */
        int age = in.nextInt();

        /* this is an example
         * on how to use
         * relational operators
         */
        if (age < 2) {
            System.out.println("Infant");
        } else if (age < 12) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
