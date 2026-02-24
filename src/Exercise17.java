public class Exercise17{

        public  static void main(String[] args){

        Employee employee = new Employee("Rahul", 65, "Bangalore", "Emp001", 65587.08);

        Student student = new Student("John", 44, "Delhi", "STU002", "Math", 78.00);

        System.out.println("Employee:");
        employee.displayInfo();
        System.out.println();
        employee.work();
        System.out.println();

        System.out.println("Student:");
        student.displayInfo();
        System.out.println();
        student.work();
        System.out.println();

        System.out.println("Polymorphism in Action");
        student.displayInfo();

        System.out.println("Array of employee");

        Person[] people = new Person[2];
        people[0] =     new Employee("Honey", 48, "Jhansi", "Emp003", 56564.00);
        people[1] =     new Employee("Anjul", 34, "Indore", "Emp005", 65678.46);

        for(Person p: people){
            System.out.println("\nPerson: " + p.getName());
            p.work();
        }

        System.out.println("Method only in child");
        employee.work();

    }
}

