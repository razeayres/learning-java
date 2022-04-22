package OO_design;

/*
this 'implements Comparable'
creates the compareTo() method
automatically in the class, which
allows classes to be compared
*/
public class Employee implements Comparable {
    /*
    these are the declarations
    of the fields only accessible
    from inside the class.
    'fields' can be called 'attributes',
    or 'instance data'
    */
    private String firstName;
    private String lastName;
    private int employeeID;
    private int deptID;
    private double salary;
    private Address address;

    /*
    this a constructor.
    This basically allows
    the object to populated
    from outside the class.
    It can be seem as an interface
    to contruct the object.
    *** It has no return type and
    the same name as the class ***
    */
    public Employee(String fname, String lname,     // this is analog to 'def __init__()'
                    int employeeID, int deptID, double salary,
                    Address address) {
        /*
        this is where the declared
        variables can be defined
        */
        firstName = fname;
        lastName = lname;
        /*
        if the name of the variable has
        the same name as the one from
        the constructor, 'this.' must be added
        to differentiate the variable from the constructor
        to the field of the class
        */
        this.employeeID = employeeID;   // 'this.' is analog to 'self.'
        this.deptID = deptID;
        this.salary = salary;
        this.address = address;
    }

//    this is an overloaded contructor used in case Employee has no last name
    public Employee(String fname,
                    int employeeID, int deptID, double salary,
                    Address address) {
        firstName = fname;
        /*
        this is used to assign
        a last name anyways to
        allow for using other
        methods that requires it
        */
        lastName = "";
        this.employeeID = employeeID;   // 'this.' is analog to 'self.'
        this.deptID = deptID;
        this.salary = salary;
        this.address = address;
    }


    /*
    these are the methods that
    provide public interfaces
    to the fields
    */
//    these are the get() methods
    public int get_employeeID() { return this.employeeID; }
    public int get_deptID() { return this.deptID; }
    public double get_salary() { return this.salary; }
    public String get_Name() { 
        return "".equals(lastName) ? firstName : firstName + " " + lastName + ", ";
    }
    /*
    this one is also a get method,
    but it is different from the
    others because it does not
    refers to a field. Instead,
    it returns a String based on
    the field deptID
    */
    public String get_DeptName(int value) { // <- this receives this.deptID
        switch(value) {
            case 001:
                return "Human Resources";
            case 002:
                return "Staff";
            case 3: // these 00 are ignored
                return "Faculty";
            default:    // <- if do not put this, it will say "missing return statement"
                return "other";
        }
    }

//    these are the set() methods
    public void set_firstName(String value)
        { firstName = value; }
    public void set_lastName(String value)
        { lastName = value; }
    public void set_employeeID(int value)
        { this.employeeID = value; }
    public void set_deptID(int value)
        { this.deptID = value; }
    public void set_salary(double value) {
        if (value > 10000) {        
            this.salary = value;
        } else {
            System.out.println("Invalid salary entered, salary not updated.");
        }
    }


//    this is a custom print method
    public void printEmployee() {
        System.out.println((("".equals(lastName)) ? "" : lastName + ", ") + // one-line if statement
                           firstName +
                           "\nEmployeeID: " + this.employeeID +
                           "\nDepartment: " + get_DeptName(this.deptID));
        System.out.printf("Salary: $%8.2f", salary);
        if (this.address == null) {
            System.out.println("\nNo address found for this employee");
        } else {
            System.out.println("\nAddress: " + this.address.toString());
        }
        System.out.println(); // this prints a blank line
    }

    /*
    this @Override allows for replace
    the the compareTo() method created
    automatically by using
    'implements Comparable' up in the
    class declaration
    */
    @Override
    public int compareTo(Object t) { // it takes an object called 't'
        /*
        this creates a new object of type
        'Employee' named as 'emp' using
        the object 't' taken as input here
        */
        Employee emp = (Employee)t; // <- this technique is called 'casting'

        if (this.salary > emp.salary) {
            return 1;
        } else if (this.salary == emp.salary) {
            return 0;
        } else {
            return -1;
        }
    }
}
