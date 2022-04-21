package basic_review;

import java.util.Scanner;

public class UsedDefinedMethods2 {
    
    /*
    this is a global variable
    inside this class, and is used
    to read input (scans the CLI)
    */
    static Scanner in = new Scanner(System.in);

    /*
    this is the main class
    it gets the total heat units
    */
    public static void main(String[] args) {
        long heat_units = getTotalHT();   // this declares heat_units as int and populates witht he return value from getHT()
        System.out.println(heat_units);   // this prints the head_units value
    }

    /*
    this is the classe the returns
    to local variable heat_units in
    the main method
    */
    public static long getTotalHT() {   // it returns long

        /*
        this declares and define
        (initialize) some variables
        that we are going to need in
        this method
        */
        long total = 0;
        char answer;
        boolean moreTemp = true;

        /*
        this is the loop that
        adds growth to plants
        until the user does not
        want to type more data
        */
        while (moreTemp) {
            total += getSingleHT(getLeafAreaIndex());   // it receives int, and sums to the total (that is long)
            System.out.println("More growth? (y/n)");
            answer = in.next().charAt(0);

        /*        
        this is to test if the loop
        will keep going. Note that the
        if statement is one-line statement
        */
        if (answer != 'y' && answer != 'Y')
            moreTemp = false;

        in.nextLine();  // this basically go to next line in CLI
        };  // it does not need the ';', but it seems a good practice to add it

        return total; // returns long
    }

    public static double getLeafAreaIndex() { // it returns int
        double LeafAreaIndex;   // this decalres the variable LeafAreaIndex but does not defines it
        System.out.println("Enter the Leaf Area Index: ");
        LeafAreaIndex = Double.valueOf(in.nextLine());  // this convert the string to double
        return LeafAreaIndex; // returns double
    }

    /*
    declaring the input like this:
    'double value' is called call-by-value
    it actually makes a copy of the
    the LeafAreaIndex into a variable called value
    */
    public static int getSingleHT(double value) { // receives double and returns int
        int heat_units = 0;

        try {
            System.out.println("Enter heat units for " + value + ":");
            heat_units = in.nextInt();
        } catch (Exception e) { // if value entered for heat_untis is not an int
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        
        heat_units *= Math.round(value); // this converts double to int and multiplies to heat_units

        return heat_units; // returns int
    }
}
