public class Excercise09 {
    public static double ctoF(double celcius){
        return celcius* (9.0/5.0)+32;
    }
    public static double ftoC(double farenhiet){
       return (farenhiet-32) * 5.0/9.0;

}
public static void main(String [] args){
        System.out.println("0°C = "+ ctoF(0) + "°F");
    System.out.println("100°C = "+ ctoF(100) + "°F");
    System.out.println("98.6°F = "+ ftoC(98.6) + "°C");
    System.out.println("212°F = "+ ftoC(212) + "°C");

    }
}
