package OO_design;

public class Payroll {
    public static void main(String[] args) {
        Address a1 = new Address("Main St.", "OH", "12345");
        Address a2 = new Address("Side St.", "54321");

        Employee emp1 = new Employee("Raze", "Ayres", 147, 003, 45000.00);
        Employee emp2 = new Employee("Jake", 150, 2, 45000.00);

        emp1.printEmployee();
        emp2.printEmployee();

        if (emp1.compareTo(emp2) == 0) {
            System.out.println("Equal salaries");
        } else if (emp1.compareTo(emp2) < 0) {
            System.out.println(emp2.get_Name() + " make more than " + emp1.get_Name());
        } else {
            System.out.println(emp1.get_Name() + " make more than " + emp2.get_Name());
        }

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
