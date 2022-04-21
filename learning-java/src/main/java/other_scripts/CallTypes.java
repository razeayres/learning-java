package other_scripts;

public class CallTypes {
    public static void main(String[] args) {
        /*
        this is an example of
        calling by value, which
        makes a copy of the value
        when entering
        new encapsulating spaces
        */
        long value = 5;
        call_by_value(value);
        System.out.println(value);

        /*
        this is an example of
        calling by reference,
        which is a object-oriented
        approach, and does not copy
        the variable
        */
        CallTypes obj = new CallTypes(); // this creates an object called CallTypes
        obj.value = 5; // this defines its field 'value' as 5
        obj.call_by_ref(obj); // this passes the object to the method
        System.out.println(obj.value); // this prints the modified field
    }

    private long value; // this is necessary to declare the variable (field) at object level

    /*
    this is the method
    the call by value
    */
    public static void call_by_value(long value) {
        value *= 2;
    }

    /*
    this is the method that
    calls by reference
    */
    public void call_by_ref(CallTypes obj) {
        obj.value *= 2;
    }
}
