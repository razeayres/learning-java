package OO_design;

public class Payroll {
    public static void main(String[] args) {
        /*
        here we create the
        Address objects
        */
        Address a1 = new Address("Main St.", "OH", "12345");
        Address a2 = new Address("Side St.", "54321");
        Address a3 = null;

        /*
        here we create the
        Employee objects, passing
        the Address objects as arguments
        for contrcuting the Employees objects
        */
        Employee emp1 = new Employee("Raze", "Ayres", 147, 003, 45000.00, a1);
        Employee emp2 = new Employee("Jake", 150, 2, 45500.00, a2);
        Employee emp3 = new Employee("Sarah", 150, 001, 50000.00, a3);  // <- see here: a3

//        these print the employees info
        emp1.printEmployee();
        emp2.printEmployee();
        emp3.printEmployee();

        /*
        here we try to update
        the salary of emp2 above
        the minimum allowed to trigger
        our condition
        */
        emp2.set_salary(600.00);
        emp2.printEmployee();

//        these are for comparing salaries of emp1 and emp3
        if (emp1.compareTo(emp2) == 0) {
            System.out.println("Equal salaries");
        } else if (emp1.compareTo(emp2) < 0) {
            System.out.println(emp2.get_Name() + " make more than " + emp1.get_Name());
        } else {
            System.out.println(emp1.get_Name() + " make more than " + emp2.get_Name());
        }

//        this prints the addresses a1 and a2 in zipcode order
        System.out.println("\nAddresses in sorted order:");
        if (a1.compareTo(a2) == 0 || a1.compareTo(a2) < 0) {
            System.out.println(a1 + "\n");
            System.out.println(a2);
        } else {
            System.out.println(a2 + "\n");
            System.out.println(a1);
        }
    }
}
