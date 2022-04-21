package basic_review;

public class NumConversion {
    public static void main(String[] args) { // this programs receives external arguments
        int firstArg = 0; // this initializes the var firstArg as int
        /*
         * if there are as least 2
         * external arguments.
         * if not, the program
         * will print 0
        */
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]); // this tries to parse the first argument into integer
            } catch (NumberFormatException e) {
                /*
                 * this raises a NumberFormatException
                 * exception if the first argument
                 * cannot be converted into integer
                 */
                System.err.println("Argument " + args[0] + " must be an integer");
                System.exit(1);
            }
            System.out.println("You entered " + firstArg); // this is just to print the first argument or 0
        }
    }
}
