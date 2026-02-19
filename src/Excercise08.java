public class Excercise08 {
    public static int[] reverseArray(int[] number) {
        int[] reverse = new int[number.length];
        int index = 0;
        for (int i = number.length-1; i >= 0; i--) {
            reverse[index] = number[i];
            index++;
        }
        return reverse;
    }
    public static void main(String [] args){
        int [] arraylist = {12,24,544,65};
        int [] reversedArray = reverseArray(arraylist);
        System.out.println("Original ArrayList:");
        for(int num: arraylist)
            System.out.println(" "+ num);
        System.out.println("Reversed ArrayList:");
        for(int num: reversedArray)
            System.out.print(" "+ num);
    }
}
