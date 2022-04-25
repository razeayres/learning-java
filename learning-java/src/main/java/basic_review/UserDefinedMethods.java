package basic_review;

import java.util.*; // this loads the entire java.util

public class UserDefinedMethods {
    /*
    this defines the Scanner class
    and name is as "in" in a global state
    inside the class
    */
    static Scanner in = new Scanner(System.in);
    
    // this is the main method where the program begins
    public static void main(String[] args) {
        /*
        this defines the var total
        as double and assign to it
        the return of the method getTotal()
        
        the interesting thing here is that
        we do not need to reference to
        self, because methods are static
        */
        double total = getTotal();
        print(total);
    }
    
    /*
    this defines the method getTotal(),
    is the entry point of the shopping loop
    */
    public static double getTotal() { // syntax of a method -> <scope> <type of the method> <type of the return type> <name of the method>
        double total = 0;
        Boolean moreItems = true;
        char response;  // this initializes the var response as char (it is not String), but do not assign any value to it
        
        /*
        if we try to use the variable
        before assign any value to it,
        it raises a java.lang.RuntimeException
        exception
        */
        // System.out.println(response); // this is just to see what is assigned in this case
        
        /*
        this creates a while loop that
        only when when the var Boolean is
        set to false
        */
        while(moreItems) {
            /*
            this first calls getItemName(),
            then uses it as argument in
            getItemPrice(), and finaly add
            thre return value to total
            */
            total += getItemPrice(getItemName());
            System.out.println("More items? (y/n)");
            response = in.next().charAt(0);
            if(response != 'y' && response != 'Y') // in this case, we do not need {}, but can use them
                moreItems = false;
            in.nextLine();
        }
        return total;
    }
    
    /*
    this getItemName() method
    uses the Scanner  the object to
    ask the user name of the item,
    and returns it
    */   
    public static String getItemName() {
        String name;
        System.out.println("Enter item name: ");
        name = in.nextLine();
        return name;
    }
    
    /*
    this one uses the return name
    from getItemName() as argument,
    and asks the user for the price 
    */    
    public static double getItemPrice(String value) {
        double price = 0;
        try { // <- this is a try-catch statement
            System.out.println("Enter price for " + value + ":");
            price = in.nextDouble(); // <- this is what actually is being tested
        /*
        if the price is not a double,
        it catch an exception and prints
        to the user a warning and the error
        */
        } catch(Exception e) {
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        /*
        if everything is fine, the next
        lines asks the user for how many
        items should be added to the cart
        */
        int quantity = getItemQuantity();
        return quantity * price; // <- it multiplies the quantity by the price
    }
    
    /*
    this method is for asking the user
    for the quantity of a certain item.
    It does not take arguments, but returns
    quantity as integer
    */
    public static int getItemQuantity() {
        System.out.println("Enter the quantity for this item: ");
        int quantity = in.nextInt(); // <- this may cause error if a letter is input
        return quantity;   
    }
    
    
    /*
    this is just a print statement
    to summarize the shopping
    */
    public static void print(double total) {
        System.out.printf("The total for your grocery items is: $%5.2f, "
                + "thanks for shopping with us!\n\n", total);
        /*
        it uses printf() instead of println(), and
        this allows for formatting.
        5.2f means it allocates a 5 characters width,
        2 decimal spaces, and f for float. There are
        different specifiers for string, date, time and boolean
        that can be used with printf()
        */
    }
}
