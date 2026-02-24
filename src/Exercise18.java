public class Exercise18 {

    public static void main(String [] args){
        Employee employee = new Employee("Rahul", 65, "Bangalore", "Emp001", 65587.08);

        Student student = new Student("John", 44, "Delhi", "STU002", "Math", 78.00);
    System.out.println("Employee - Workable and Payable");
    employee.displayInfo();
    System.out.println("Work Type:  " + employee.getWorkType());
    employee.work();
    employee.calculateSalary();

        System.out.println("Student - Workable only");
        student.displayInfo();
        System.out.println("Work Type::" + student.getWorkType());
        student.work();
        student.study();

        System.out.println("\n=== Interface Polymorphism ===");

        Workable[] workers = new Workable[2];
        workers[0]= employee;
        workers[1]= student;

        for(Workable w: workers){
            System.out.println("Work Type: "+ w.getWorkType());
            w.work();
        }

        System.out.println("Payable Interface");

        Payable[] payableEmployees = new Payable[1];
        payableEmployees[0]= employee;
        for(Payable p: payableEmployees){
            p.calculateSalary();
            System.out.println("Tax amount: "+ p.calculateTaxRate());

        }
        System.out.println("\n=== Type Checking with Interfaces ===");
        checkInterfaces(employee);
        checkInterfaces(student);
    }

    public static void checkInterfaces(Person p) {
        System.out.println("\nChecking: " + p.getName());

        if (p instanceof Workable) {
            System.out.println("  ✓ Is Workable");
        }

        if (p instanceof Payable) {
            System.out.println("  ✓ Is Payable");
            Payable payable = (Payable) p;
            System.out.println("  Salary: $" + payable.getSalary());
        } else {
            System.out.println("  ✗ Not Payable");
        }
    }
}

