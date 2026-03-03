import static jdk.jfr.consumer.EventStream.openFile;

public class Exercise21 {

    public static void main(){

        System.out.println("Test 1: Finally Block ");
        testFinally(true);
        testFinally(false);

        System.out.println("Test 2: Throwing Exceptions ");
        try{
            checkAge(25);
            checkAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Test 3: Bank Withdrawal ");
        try {
            withdraw(1000, 500);   // Valid
            withdraw(1000, 1500);  // Invalid - throws exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Test 4: Resource Cleanup ===");
        openFile("data.txt");
    }

    public static void testFinally(boolean shouldThrowException){
        try {
            System.out.println("In try block");
            if (shouldThrowException) {
                throw new Exception("Test exception");
            }
            System.out.println("Try block completed");
        } catch (Exception e) {
            System.out.println("In catch block: " + e.getMessage());
        } finally {
            System.out.println("In finally block (ALWAYS runs)");
        }
        System.out.println("After try-catch-finally\n");
    }

    public  static void checkAge(int age){
        if(age < 0)
        {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        System.out.println("Age " + age + " is valid");
        }

        public static void withdraw(double balance, double amount){
            System.out.println("Attempting to withdraw $" + amount + " from balance $" + balance);

            if(amount<=0 ){
                throw new IllegalArgumentException("Amount must be positive ");
            }
            if(amount > balance){
                throw  new IllegalArgumentException("Insufficient Bank Balance");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
        public static void openFile(String filename){
        System.out.println("Opening File: "+ filename);
            try {
                System.out.println("Reading file...");
                // Simulate error
                if (filename.equals("data.txt")) {
                    throw new Exception("File corrupted!");
                }
                System.out.println("File read successfully");
            } catch (Exception e) {
                System.out.println("Error reading file: " + e.getMessage());
            } finally {
                // Cleanup always happens
                System.out.println("Closing file: " + filename);
            }
        }
}


