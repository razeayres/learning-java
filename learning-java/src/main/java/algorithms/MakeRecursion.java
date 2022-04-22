package algorithms;

/*
recursion is O(1),
so there is a limit
on how many iterations
can be done recursively
*/
public class MakeRecursion {
    public static void main(String[] args) {
        System.out.println("The counter has begun!");
        countDown(10); // <- this where the processing starts
        System.out.println("blastoff");
    }

    public static void countDown(int count) { // <- count is declared here
        /*
        this is for ending
        the recursion
        when count == 0
        */
        if (count == 0) {
            return; // <- this exits the function, returning void
        }

//        this prints current count value
        System.out.println(count + "...");

//        this is where recursion really happens
        countDown(count - 1);
    }
}
