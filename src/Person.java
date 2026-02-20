public class Person {

private String name;
private int age;
private String city;

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>0 && age<150) {
            this.age = age;
        }
        else
            System.out.println("Invalid age");
    }

    public void setCity(String city){
        if(city != null && !city.isEmpty()) {
            this.city = city;
        }
        else
            System.out.println("Invalid city");
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
        else
            System.out.println("Invalid name");
    }


    public Person(String name, int age, String city){
    this.name = name;
    this.age = age;
    this.city = city;


}

public void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("City: "+city);
    }

 public void introduce(){
    System.out.println("I am "+name+ " from "+city);
    }
}
