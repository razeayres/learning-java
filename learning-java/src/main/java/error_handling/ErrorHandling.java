package error_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        String filename;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        filename = in.nextLine();

        Scanner inFile = null;
        double total = 0;
        int count = 0;

        try {

            inFile = new Scanner(new File(filename));

            while (inFile.hasNextDouble()) {
                total += inFile.nextDouble();
                count ++;
            }

            System.out.printf("The average is: %8.2f", (total/count));
            System.out.println();

        } catch(FileNotFoundException e) {
            System.out.println("Input file does not exist.");

        } finally {

            try {
                inFile.close();
            } catch(NullPointerException e) {
                System.out.println("Input file was never opened.");
            }
        }
    }
}
