package data_structures;

public class arrays {
//    syntax: type[] = new type[]
    public static void main(String[] args) {
//        this array is only for int and holds 20 values at max
        int[] ages = new int[20];

        /*
        this one does not specify the
        size, but it is calculated
        automatically, and does require
        "new" keyword
        */
        double[] prices = {5.25, 6.5, 2.3, 20.75};

        /*
        this is an example on
        how to acess elements
        on a list, and make calculations
        with them
        */
        double total = prices[0] +
                       prices[1] +
                       prices[2] +
                       prices[3];

//        these are arrays of boolean and characters
        boolean[] answers = {true, false, false, true, true};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        /*
        this instantiates an array
        of type string that can hold
        10 strings
        */
        String[] names = new String[10];

//        testing
        names[0] = "Rodrigo Miranda";
        names[1] = "Raze Ayres";
        for (int i = 0; i < 10; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }
    }
}
