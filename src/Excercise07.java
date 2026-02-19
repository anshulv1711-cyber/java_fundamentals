public class Excercise07 {

    public static int arrayMin(int[] numbers){
        int min = numbers[0];
        for(int num : numbers){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int [] arrayList = {64,23,45,81,763,237,34,23,535,3,98,23,5435,};
        int result = arrayMin(arrayList);
        System.out.println("Smallest number is "+result);
    }
}
