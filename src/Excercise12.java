public class Excercise12 {
    public static void main (String[] args){
        Person person1 = new Person("Anshul", 30, "Delhi");
        Person person2 = new Person("Rahul", 34, "Mumbai");
        Person person3 = new Person("Ankita", 22, "Noida");
        person1.displayInfo();
        System.out.println();
        person2.introduce();
        System.out.println();
        person3.displayInfo();

    }
}
