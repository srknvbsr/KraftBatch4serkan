package day_39_ConstructorOverloadıng;


public class C01_StudenObjects {
    public static void main(String[] args) {


        Student student1 = new Student("Mehmet",25,'M', 95,12345);
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        student1.name="Osman";
        System.out.println(student1);//eğer String toString
        // metodu ile yazmazsan bu sefer referans yazar ekrana.
    }
}
