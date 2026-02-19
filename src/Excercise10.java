import java.util.ArrayList;
public class Excercise10 {
    public static void main(String[] args) {

        ArrayList<String> shop = new ArrayList<>();
        shop.add("Milk");
        shop.add("Butter");
        shop.add("Bread");
        shop.add("Eggs");
        shop.add("Cheese");

        System.out.println("Shopping List:" + shop);
        shop.remove("Bread");
        boolean milk = shop.contains("Milk");
        System.out.println("Contains Milk:" +milk);
        boolean bread = shop.contains("Bread");
        System.out.println("Contains Bread:" +bread);
        for (String item : shop)
            System.out.println(item);
        System.out.println("Shop Size:" +shop.size());
    }
}