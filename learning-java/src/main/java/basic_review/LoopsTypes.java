package basic_review;

import java.util.*;

public class LoopsTypes {
    public static void main(String[] args) {
        /* this starts the input
        scanner on console */
        Scanner in = new Scanner(System.in);    // "Scanner" is the template and "in" is the name of the object

        int choice; // <- this initialize the variable choice as integer
        
        /*
        this is example of a
        do-while loop.
        it keeps asking for the
        item until a valid number
        is given
        */
        do {
            System.out.println("Choose and item from the list below: ");
            System.out.println("____________________________________");
            System.out.println("1. Hot dog");
            System.out.println("2. Hamburger");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Veggie Burger");
            System.out.println("5. Nachos");
            choice = in.nextInt();  // this captures the input as int. If it is not int, it raises java.util.InputMismatchException
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        
        /*
        this is a switch statement.
        based on the previous choice
        it prints the price of the food
        */
        switch (choice) {
            case 1:
                System.out.println("You chose a hot dog, that is $1.00");
                break;
            case 2:
                System.out.println("You chose a hamburger, that is $2.50");
                break;
            case 3:
                System.out.println("You chose a cheeseburger, that is $3.00");
                break;
            case 4:
                System.out.println("You chose a veggie burger, that is $3.25");
                break;
            case 5:
                System.out.println("You chose nachos, that is $1.75");
                break;
            /*
            this default case is never
            because of the do-while code,
            but it would trigger if any of
            the above case would be satisfied
            */
            default:
                System.out.println("Have a good day");
                break;
        }
        
        // this is a while loop
        double loanBalance = 5000;  // <- this initializes the var loanBalance as double and store 5000 in it
        int months = 0; // <- this also initializes the var month as int and stores 0 in it
        while (loanBalance > 0) {
            loanBalance -= 500; // -= is the same as "loanBalance = loanBalance - 500"
            months++;   // ++ always add 1 to the value stored
        }
        System.out.println("It will take " + months + " months to pay back your loan!");

        
        /*
        this is a regular for
        loop
        */
        System.out.println("Odd numbers between 1 and 100 are: ");
        for (int i = 1; i < 99; i++) {  // (<var initialized>, <condition to continue>, <modifier of the initialized var>)
            if (i % 2 == 1) {   // this is a conditional statement (% <- is the operator of rest)
                System.out.print(i + ", ");
            }
        }
        System.out.print("99\n");

    }
}