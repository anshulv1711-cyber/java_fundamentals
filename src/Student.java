public class Student extends Person implements Workable {
    private String studentID;
    private final String subject;
    private final double score;

    public Student(String name, int age, String city, String studentID, String subject, double score) {
        super(name, age, city);
        this.studentID = studentID;
        this.score = score;
        this.subject = subject;
    }

    public String getStudentId() {
        return studentID;
    }

    public void setStudentId(String studentID) {
        if (studentID != null && !studentID.isEmpty()) {
            this.studentID = studentID;
        } else System.out.println("Invalid Employee ID");
    }

    public String getSubject() {
        return subject;
    }

    public Double getScore() {
        return score;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            System.out.println("Invalid GPA");
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying in subject " + subject + "(Student ID: " + studentID + ")");
    }

    @Override
    public String getWorkType(){
        return "Studies";
    }

    public void study() {
        System.out.println(getName() + " is studying hard for " + subject + " exam.");
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Subject: " + subject);
        System.out.println("Score: " + score);
    }

}




