package day_57_OOP;

class Person {
    public String name;
    public char gender;
    public int age;

    public Person(String name) {
    this.name=name;
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}


public class C01_ClassReview {
    public static void main(String[] args) {
        Person person = new Person("Aoron");
        System.out.println("person.name = " + person.name);
        person.name = "Hand";
        person.age = 18;
        person.gender='F';





        System.out.println(person);

    }

}
