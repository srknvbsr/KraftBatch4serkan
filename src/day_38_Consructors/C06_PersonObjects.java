package day_38_Consructors;

public class C06_PersonObjects {
    public static void main(String[] args) {


        Person person1 = new Person();
        person1.gender = 'f';
        person1.name = "Ayşe";
        System.out.println("person1.name = " + person1.name);
        System.out.println("person1 = " + person1);
        Person person2 = new Person("ali", 'm', 30);
        System.out.println("person2.name = " + person2.name);
        System.out.println("person2.gender = " + person2.gender);
        System.out.println("person2.age = " + person2.age);
        System.out.println("person2 = " + person2);
    }
}