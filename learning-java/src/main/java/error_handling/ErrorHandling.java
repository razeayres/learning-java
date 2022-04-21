package error_handling;

// these are used libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        String filename; // <- this declares the variable filename as String type

        /*
        this is for reading
        the path to the file
        from the CLI
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        filename = in.nextLine();

        /*
        these are just more
        declations w/ definitions
        */
        Scanner inFile = null;
        double total = 0;
        int count = 0;

        try {
            /*
            this creates an object
            Scanner which takes as
            argument an object File.

            This is the right
            combination to open
            and read a file
            */
            inFile = new Scanner(new File(filename));

            /*
            this iterates through
            the file until there
            is no more numbers
            */
            while (inFile.hasNextDouble()) { // <- this 'inFile.hasNextDouble()' checks if there is a next number in the file
                total += inFile.nextDouble(); // <- this adds this next number in the variable total
                count ++; // this one is for counting the numbers
            }

            /*
            this calcualtes the average
            all number in the file,
            and prints it
            */
            System.out.printf("The average is: %8.2f", (total/count));
            System.out.println();

        } catch(FileNotFoundException e) {  // <- this is in case the file is typed but does not exist
            System.out.println("Input file does not exist.");

        } finally {
            /*
            this a nested try-catch
            inside of the finally{}
            statement
            */
            try {
                inFile.close(); // <- this tries to close the file
            } catch(NullPointerException e) { // <- this is only printed if the file was never opened
                System.out.println("Input file was never opened.");
            }
        }
    }
}
