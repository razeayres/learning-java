import java.util.*;

public class UserDefinedMethods {
    /*
    this fines the Scanner class
    and name is as "in"
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
    public static double getTotal() // syntax of a method -> <scope> <type of the method> <type of the return type> <name of the method>
    {
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
        while(moreItems)
        {
            /*
            this first calls getItemName(),
            then uses it as argument in
            getItemPrice(), and finaly add
            thre return value to total
            */
            total += getItemPrice(getItemName());
            System.out.println("More items? (y/n)");
            response = in.next().charAt(0);
            if(response != 'y' && response != 'Y')
                moreItems = false;
            in.nextLine();
        }
        return total;
    }
    
    
    
    public static String getItemName()
    {
        String name;
        System.out.println("Enter item name: ");
        name = in.nextLine();
        return name;
    }
    
    
    
    public static double getItemPrice(String value) 
    {
        double price = 0;
        try{
        System.out.println("Enter price for " + value + ":");
        price = in.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }
    
    
    
    public static int getItemQuantity()
    {
        System.out.println("Enter the quantity for this item: ");
        int quantity = in.nextInt();
        return quantity;   
    }
    
    
    
    public static void print(double total)
    {
        System.out.printf("The total for your grocery items is: $%5.2f, "
                + "thanks for shopping with us!\n\n", total);
        
    }
}
