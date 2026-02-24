public class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, int age, String city, String empId, double salary) {
        super(name, age, city);
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be 0");
        }

    }
    public void setEmpId(String empId) {
            if(empId != null && !empId.isEmpty()) {
                this.empId = empId;
            }
            else
            System.out.println("Invalid Employee ID");
        }
        @Override
        public void work(){
                System.out.println(getName()+" is working as employee "+ empId);
            }

            @Override
        public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: " + empId);
                System.out.println("Salary for Employee "+getName()+" is " + salary);
            }
        }



