package debugging;

public class LogicalError {
    public static void main(String[] args) {
        int value = 1;

        System.out.println(value);
        System.out.println(value/2);
        System.out.println(value/0);  // logical error found here
        System.out.println(value*2);
        System.out.println(value*0);
    }
}
