public class Excercide05 {
    public static void main(String[] args){
        int n=7;
        int factorial=1;

        for(int i=2;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println(n+"!="+factorial);
    }
}
