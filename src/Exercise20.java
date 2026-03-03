public class Exercise20 {

    public static void main(String[] args){
        System.out.println("Test 1: Division by Zero ");
        safeDivide(10,2);
        safeDivide(10,0);


        System.out.println("Test 2: Array Excess ");
        int[] numbers = {1,2,3,4,5};
        safeArrayAccess(numbers, 2);
        safeArrayAccess(numbers, 7);

        System.out.println("Test 3: String Parsing ");
        parseNumber("123");
        parseNumber("abc");

        System.out.println("Test 4: Null Reference ");
        printLength("text");
        printLength(null);
    }

    public static void safeDivide(int a, int b){
        try{
            int result = a/b;
            System.out.println(a+" / "+b +" = "+ result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
    public static void safeArrayAccess(int[] array, int index){
        try{
            int value = array[index];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds!");
        }
    }

    public static void parseNumber(String text){
        try{
            int number = Integer.parseInt(text);
            System.out.println("Parsed Number: "+number);
        } catch (NumberFormatException e) {
            System.out.println("Error: "+ text +" is not a valid number!");
        }
    }

    public static void printLength(String text){
        try{
            int length = text.length();
            System.out.println("Length is "+ length);
        }catch (NullPointerException e){
            System.out.println("Error: String is null!");
        }
    }
}
