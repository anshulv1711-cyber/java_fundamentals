public class Excercise14 {
    public static void main(String [] args){
        Person a = new Person("Anshul", 30, "Noida");
        System.out.println("Name: "+a.getName());
        System.out.println("Age: "+a.getAge());

        a.setName(null);
        a.setAge(-20);
        a.setAge(67);
        a.setCity("");
        a.setCity("Mumbai");

        System.out.println();
        a.displayInfo();


    }
}
