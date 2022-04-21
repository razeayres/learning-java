package other_scripts;

public class Counter {
    public static void main(String[] args) {
        /*
        with this, we declare and dfine
        our variable count as integer as
        zero
        */
        int count = 0;

        System.out.println("Counting from 1 to 10...");
        while (count != 10) {
            count ++; // <- this adds 1 to count, like (count = count + 1) or (count += 1)
            System.out.println(count);
        }

        System.out.println("Counting from 10 to 1...");
        while (count > 0) {
            System.out.println(count);
            count --; // <- this substracts 1 to count, like (count = count - 1) or (count -= 1)
        }
    }
}
