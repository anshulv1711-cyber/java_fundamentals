public class Excercise06 {

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] testArray={12,12,43,54,546,4,2,123,4};
        int result = arraySum(testArray);
        System.out.println("Sum = "+result);
    }
}

