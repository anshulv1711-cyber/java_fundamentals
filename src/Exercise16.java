public class Exercise16 {

    public static void main(String[] Args) {

        Person person = new Employee("Anshul", 30, "Noida", "Emp003", 9685);
        Employee employee = new Employee("Rahul", 65, "Bangalore", "Emp001", 65587.08);

        Person polyEmp = new Employee("John", 44, "Delhi", "Emp002", 64658.00);

        System.out.println("Regular Objects:");
        person.displayInfo();
        System.out.println();
        employee.displayInfo();
        System.out.println();

        System.out.println("Polymorphism in Action");
        polyEmp.displayInfo();

        System.out.println("Array of employee");

        Person[] people = new Person[3];
        people[0] = new Employee("Honey", 48, "Jhansi", "Emp003", 56564.00);
        people[1] = new Employee("Anjul", 34, "Indore", "Emp005", 65678.46);

        for (Person p : people) {
            p.displayInfo();
            System.out.println();
        }

        System.out.println("Method only in child");
        employee.work();

        if (polyEmp instanceof Employee) {
            ((Employee) polyEmp).work();
        }
    }
}
