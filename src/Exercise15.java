public class Exercise15 {
    public static void main(String[] args){
        Employee anshul = new Employee("Anshul", 30, "Noida", "EMP001", 45000.00);

        anshul.introduce();
        System.out.println("Age: "+anshul.getAge());
        System.out.println();
        anshul.work();
        System.out.println();
        anshul.displayInfo();
        System.out.println();
        anshul.setSalary(56518.83);
        anshul.setSalary(-87682);
        System.out.println("Updated salary: $" + anshul.getSalary());

    }
}
